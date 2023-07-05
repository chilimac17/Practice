//This program will create an orphan process that will be inherited by systemd.

//The program will create a child process that will run for 5 minutes in the background.

//While the program is executing, the program will pause. This will allow us to view
//the child process before and after the parent has exited.

//When Enter is pressed, the parent process will exit leaving the child without 
//a parent process.



#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdlib.h>

int main(void) {
   pid_t pid;                                                   //hold pid #
   printf("Parent PID is %d\n", getpid());   
   
   //fork, save the PID, and check for errors
   if((pid = fork()) == -1)  {
      perror("Can't fork");
      return 1;
   }
   if (pid == 0) {              //in the child process?
       printf("Child will run for 5 minutes\n");
       sleep(300);
       exit(0);
   }
   else if (pid > 0) {          //in the parent process?
      printf("Child has PID %d\n"
             "Parent will exit when Enter is pressed\n", pid);
      getchar();                //read in one character....Enter
      return 0;
   }
   else {                       //error occurred
      fprintf(stderr, "Error forking\n");
      return 1;
   }
   return 0;
}