//Example code: A simple server side code, which echos back the received message.
//Handle multiple socket connections with select and fd_set on Linux
#include <stdio.h>
#include <string.h> //strlen
#include <stdlib.h>
#include <errno.h>
#include <unistd.h> //close
#include <arpa/inet.h> //close
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <sys/time.h> //FD_SET, FD_ISSET, FD_ZERO macros
	
#define TRUE 1
#define FALSE 0
#define PORT 8080

	
int main(int argc , char *argv[])
{
	int opt = TRUE;
	int master_socket , addrlen , new_socket , client_socket[30] ,
		max_clients = 30 , activity, i , valread , sd;
	int max_sd;
	int n;
	int w;
	struct sockaddr_in address;
		
	char buffer[1025]; //data buffer of 1K
		
	//set of socket descriptors
	fd_set readfds;
		
	//a message
	char *message = "ECHO Daemon v1.0 \r\n";

    printf("HIT 1\n");
	
	//initialise all client_socket[] to 0 so not checked
	for (i = 0; i < max_clients; i++)
	{
		client_socket[i] = 0;
	}
	printf("HIT 1.5\n");
	//create a master socket
	if( (master_socket = socket(AF_INET , SOCK_STREAM , 0)) == 0)
	{
		perror("socket failed");
		exit(EXIT_FAILURE);
	}
	printf("HIT 2\n");
	//set master socket to allow multiple connections ,
	//this is just a good habit, it will work without this
	if( setsockopt(master_socket, SOL_SOCKET, SO_REUSEADDR, (char *)&opt,
		sizeof(opt)) < 0 )
	{
		perror("setsockopt");
		exit(EXIT_FAILURE);
	}
	printf("HIT 3\n");
	//type of socket created
	address.sin_family = AF_INET;
	address.sin_addr.s_addr = INADDR_ANY;
	address.sin_port = htons( PORT );
		
	//bind the socket to localhost port 8888
	if (bind(master_socket, (struct sockaddr *)&address, sizeof(address))<0)
	{
		perror("bind failed");
		exit(EXIT_FAILURE);
	}
	printf("Listener on port %d \n", PORT);
		
	//try to specify maximum of 3 pending connections for the master socket
	if (listen(master_socket, 3) < 0)
	{
		perror("listen");
		exit(EXIT_FAILURE);
	}
	printf("HIT 3.5\n");
	//accept the incoming connection
	addrlen = sizeof(address);
	puts("Waiting for connections ...");
	/*
	int pid;
	while(1)
	{
		new_socket = accept(master_socket, (struct sockaddr *)&address, (socklen_t*)&addrlen);
		if(new_socket < 0)
		{
			perror("ERROR: on accept");
		}

		pid = fork();
		if(pid < 0){
			perror("ERROR: in new process creation");
			//close(master_socket);
		}

		if(pid == 0){
			
			close(master_socket);
			bzero(buffer,1025);
			n = read(new_socket, buffer, 1024);
			if(n <0)
			{
				perror("ERROR: reading from socket");
			}

			printf("Here is the message: %s\n",buffer);
			w = write(new_socket, "I got your message", 18);
			if(w <0)
			{
				perror("ERROR: writing to socket");
			}
			close(new_socket);
		}else{
			close(new_socket);
		}
	} 
	*/	
	while(TRUE)
	{
        printf("HIT 4\n");
		//clear the socket set
		FD_ZERO(&readfds);

        printf("HIT 5\n");
		//add master socket to set
		FD_SET(master_socket, &readfds);
		max_sd = master_socket;
			
		//add child sockets to set
		for ( i = 0 ; i < max_clients ; i++)
		{
            printf("HIT 6\n");
			//socket descriptor
			sd = client_socket[i];
				
			//if valid socket descriptor then add to read list
			if(sd > 0)
				printf("HIT 6.5\n");
				FD_SET( sd , &readfds);
				
			//highest file descriptor number, need it for the select function
			if(sd > max_sd)
				printf("HIT 6.8\n");
				max_sd = sd;
		}
	
		//wait for an activity on one of the sockets , timeout is NULL ,
		//so wait indefinitely
		activity = select( max_sd + 1 , &readfds , NULL , NULL , NULL);
	
		if ((activity < 0) && (errno!=EINTR))
		{
			printf("select error");
		}
		printf("HIT 7\n");
		//If something happened on the master socket ,
		//then its an incoming connection
		if (FD_ISSET(master_socket, &readfds))
		{
            printf("HIT 8\n");
			if ((new_socket = accept(master_socket,
					(struct sockaddr *)&address, (socklen_t*)&addrlen))<0)
			{
				perror("accept");
				exit(EXIT_FAILURE);
			}
			
			//inform user of socket number - used in send and receive commands
			printf("New connection , socket fd is %d , ip is : %s , port : %d \n" , new_socket , inet_ntoa(address.sin_addr) , ntohs
				(address.sin_port));
		
			//send new connection greeting message
			if( send(new_socket, message, strlen(message), 0) != strlen(message) )
			{
				perror("send");
			}
				
			puts("Welcome message sent successfully");
				
			//add new socket to array of sockets
			for (i = 0; i < max_clients; i++)
			{
				//if position is empty
				if( client_socket[i] == 0 )
				{
					client_socket[i] = new_socket;
					printf("Adding to list of sockets as %d\n" , i);
						
					break;
				}
			}
		}
		printf("HIT 9\n");
		//else its some IO operation on some other socket
		for (i = 0; i < max_clients; i++)
		{
            printf("HIT 10\n");
			sd = client_socket[i];
				
			if (FD_ISSET( sd , &readfds))
			{
                printf("HIT 11\n");
				//Check if it was for closing , and also read the
				//incoming message
				if ((valread = read( sd , buffer, 1024)) == 0)
				{
                    printf("HIT 12\n");
					//Somebody disconnected , get his details and print
					getpeername(sd , (struct sockaddr*)&address , \
						(socklen_t*)&addrlen);
					printf("Host disconnected , ip %s , port %d \n" ,
						inet_ntoa(address.sin_addr) , ntohs(address.sin_port));
						
					//Close the socket and mark as 0 in list for reuse
					close( sd );
					client_socket[i] = 0;
				}
					
				//Echo back the message that came in
				else
				{
                    printf("HIT 13\n");
					//set the string terminating NULL byte on the end
					//of the data read
                    if(strcmp(buffer,"shutdown") == 0)
                    {
						printf("HIT 13.5\n");
                        close( sd );
					    client_socket[i] = 0;
                    }
                    else
                    {
                        printf("HIT 14\n");
                        buffer[valread] = '\0';
					    send(sd , buffer , strlen(buffer) , 0 );
                    }
					
				}
			}
			else
			{
				printf("HIT 10.5\n");
			}
		}
		printf("HIT 15\n");
	}
	
		
	return 0;
}
