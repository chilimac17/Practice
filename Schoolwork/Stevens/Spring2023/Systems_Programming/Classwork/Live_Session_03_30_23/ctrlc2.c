//This program calls sigaction instead of signal to set the signal handler for CTRL+C (SIGINT)
//to the function ouch.  It must first set up a sigaction structure that contains the handler,
//a signal mask, and flags...although no flags are needed.  The empty signal mask is created
//with the new function sigemptyset.

#include<signal.h>
#include<stdio.h>
#include<unistd.h>

void ouch(int sig) {   //define actions to be taken on receipt of signal
   printf("\nOuch! - Signal %d sent.\n", sig);
}

void ouch1(int sig)
{
   printf("\nSignal - Signal %d sent.\n", sig);
}

int main(void) {
   struct sigaction act;
   struct sigaction act1;

   act.sa_handler = ouch;   //set the signal handler to execute function ouch when received
   act1.sa_handler = ouch1;

   act.sa_flags = 0;

   sigaction(SIGINT, &act, 0);  //execute the handler when the SIGINT signal sent
   sigaction(SIGINT, &act1, 0);

   while (1) {                  //infinite loop....the only way out is to send SIGQUIT signal
      printf("Hello\n");
      sleep(1);
   }
}
