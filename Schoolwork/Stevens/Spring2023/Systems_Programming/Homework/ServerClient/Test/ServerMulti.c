#include <stdio.h>
#include <netdb.h>
#include <netinet/in.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <sys/types.h>
#include <unistd.h>	  // read(), write(), close()
#include <sys/time.h> //FD_SET, FD_ISSET, FD_ZERO macros
#include <netinet/in.h>
#include <errno.h>
#include <arpa/inet.h> //close
#include <sys/time.h>  //FD_SET, FD_ISSET, FD_ZERO macros
#include <pthread.h>

#define MAX 1025
#define PORT 8080
#define TRUE 1
#define SA struct sockaddr

	int master_socket;
	int addrlen;
	int max_sd;
	int sd;
	int activity;
	int new_socket;
	int val_read_from_client;
	char buffer[MAX];
	pthread_t tid;
	int max_clients = 10;
	int client_socket[10];
	char *message = "Welcome to Server Client App \r\n";
	int current_client_fd_number;
	char *current_client_ip;
	int opt = TRUE;
	struct sockaddr_in servaddr, cli;

	fd_set readfds;

// Function designed for chat between client and server.
void func(int connfd, int client_fd_num, char *ip_num)
{
	char buff[MAX];
	int n;
	// infinite loop for chat

	bzero(buff, MAX);

	// read the message from client and copy it in buffer
	read(connfd, buff, sizeof(buff));
	// print buffer which contains the client contents
	printf("Current Client FD Num: %d \nCurrent Client IP: %s\n", client_fd_num, ip_num);
	printf("From client: %s\t To client : ", buff);
	bzero(buff, MAX);
	n = 0;
	// copy server message in the buffer
	while ((buff[n++] = getchar()) != '\n')
		;

	// and send that buffer to client
	write(connfd, buff, sizeof(buff));

	// if msg contains "Exit" then server exit and chat ended.
	if (strncmp("exit", buff, 4) == 0)
	{
		printf("Server Exit...\n");
	}
}

// NEW SERVER CLIENT TALK
void serverClientEngage(int connfd)
{
}

// Driver function
int main()
{
	/*
	int master_socket;
	int addrlen;
	int max_sd;
	int sd;
	int activity;
	int new_socket;
	int val_read_from_client;
	char buffer[MAX];

	int max_clients = 10;
	int client_socket[10];
	char *message = "Welcome to Server Client App \r\n";
	int current_client_fd_number;
	uint16_t current_client_ip;
	int opt = TRUE;
	struct sockaddr_in servaddr, cli;

	fd_set readfds;
	*/

	// initialise all client_socket[] to 0 so not checked
	for (int i = 0; i < max_clients; i++)
	{
		client_socket[i] = 0;
	}

	// socket create and verification
	master_socket = socket(AF_INET, SOCK_STREAM, 0);
	if (master_socket == 0)
	{
		printf("socket creation failed...\n");
		exit(0);
	}
	else
	{
		printf("Socket successfully created..\n");
	}
	bzero(&servaddr, sizeof(servaddr));

	// set master socket to allow multiple connections ,
	// this is just a good habit, it will work without this
	if (setsockopt(master_socket, SOL_SOCKET, SO_REUSEADDR, (char *)&opt,
				   sizeof(opt)) < 0)
	{
		perror("setsockopt");
		exit(EXIT_FAILURE);
	}

	// assign IP, PORT
	servaddr.sin_family = AF_INET;
	servaddr.sin_addr.s_addr = htonl(INADDR_ANY);
	servaddr.sin_port = htons(PORT);

	// Binding newly created socket to given IP and verification
	if ((bind(master_socket, (SA *)&servaddr, sizeof(servaddr))) != 0)
	{
		printf("socket bind failed...\n");
		exit(0);
	}
	else
		printf("Socket successfully binded..\n");

	// Now server is ready to listen and verification
	if ((listen(master_socket, 5)) != 0)
	{
		printf("Listen failed...\n");
		exit(0);
	}
	else
		printf("Server listening..\n");
	addrlen = sizeof(cli);

	// THIS IS WHERE ALL MODS OCCUR

	// Accept the data packet from client and verification
	/*
	connfd = accept(master_socket, (SA *)&cli, &addrlen);
	if (connfd < 0)
	{
		printf("server accept failed...\n");
		exit(0);
	}
	else
		printf("server accept the client...\n");
	*/
	// CHANGE ABOVE

	while (TRUE)
	{
		// clear the socket set
		FD_ZERO(&readfds);

		// add master socket to set
		FD_SET(master_socket, &readfds);
		max_sd = master_socket;

		// add child sockets to set
		for (int i = 0; i < max_clients; i++)
		{
			// socket descriptor
			sd = client_socket[i];

			// if valid socket descriptor then add to read list
			if (sd > 0)
				FD_SET(sd, &readfds);

			// highest file descriptor number, need it for the select function
			if (sd > max_sd)
				max_sd = sd;
		}

		// wait for an activity on one of the sockets , timeout is NULL ,
		// so wait indefinitely
		activity = select(max_sd + 1, &readfds, NULL, NULL, NULL);

		if ((activity < 0) && (errno != EINTR))
		{
			printf("select error");
		}

		// If something happened on the master socket ,
		// then its an incoming connection
		if (FD_ISSET(master_socket, &readfds))
		{
			if ((new_socket = accept(master_socket, (struct sockaddr *)&servaddr, (socklen_t *)&addrlen)) < 0)
			{
				perror("accept");
				exit(EXIT_FAILURE);
			}

			// inform user of socket number - used in send and receive commands
			current_client_fd_number = new_socket;
			current_client_ip = inet_ntoa(servaddr.sin_addr);
			printf("New connection , socket fd is %d , ip is : %s , port : %d \n", new_socket, inet_ntoa(servaddr.sin_addr), ntohs(servaddr.sin_port));

			// send new connection greeting message
			if (send(new_socket, message, strlen(message), 0) != strlen(message))
			{
				perror("send");
			}

			puts("Welcome message sent successfully");

			// add new socket to array of sockets
			for (int i = 0; i < max_clients; i++)
			{
				// if position is empty
				if (client_socket[i] == 0)
				{
					client_socket[i] = new_socket;
					printf("Adding to list of sockets as %d\n", i);

					break;
				}
			}
		}

		// else its some IO operation on some other socket
		for (int i = 0; i < max_clients; i++)
		{
			sd = client_socket[i];

			if (FD_ISSET(sd, &readfds))
			{
				// Check if it was for closing , and also read the
				// incoming message
				if ((val_read_from_client = read(sd, buffer, 1024)) == 0)
				{
					// Somebody disconnected , get his details and print
					getpeername(sd, (struct sockaddr *)&servaddr,
								(socklen_t *)&addrlen);
					printf("Host disconnected , ip %s , port %d \n",
						   inet_ntoa(servaddr.sin_addr), ntohs(servaddr.sin_port));

					// Close the socket and mark as 0 in list for reuse
					close(sd);
					client_socket[i] = 0;
				}

				// Echo back the message that came in
				else
				{
					// set the string terminating NULL byte on the end
					// of the data read
					// buffer[val_read_from_client] = '\0';
					// send(sd , buffer , straddrlen(buffer) , 0 );
					//////pthread_create(&tid, NULL, func(new_socket, current_client_fd_number, current_client_ip),(void *)&tid);
					func(new_socket, current_client_fd_number, current_client_ip);
				}
			}
		}
	}

	// Function for chatting between client and server
	// func(connfd);

	// After chatting close the socket
	close(master_socket);
}
