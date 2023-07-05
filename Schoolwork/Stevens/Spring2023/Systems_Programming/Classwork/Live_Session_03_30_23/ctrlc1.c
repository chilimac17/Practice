//This program will call the function ouch to be called when the SIGINT signal is typed in.
//After the interrupt function ouch has completed, the program continues, but the signal
//action is restored back to its default...that is...stopping the program.
//
//It's not a good idea to use the signal interface for catching signals.  You may find
//this in older legacy programs.


#include<signal.h>
#include<stdio.h>
#include<unistd.h>
/*
void ouch(int sig) {
   printf("Ouch! - I got signal %d\n", sig);
   (void) signal(SIGINT, SIG_DFL);       //restores signal action back to default
}

int main() {
   signal(SIGINT, SIG_IGN);
    printf("Outside");
   while(1) {
      printf("Inside");
      sleep(1);
   }
}

   void func1(int signum)
    {
        printf("No! ");
        exit(SIGSEGV);
    }

    int main()
    {
        int j;
        double *t, num[5];

        signal(SIGSEGV, func1);
        num[0] = 0.0;
        t = 0;
        for (int k = 1; k < 5; k++)
        {
        num[k] = (double)k + 11.0;
        if (num[k-1] > 12.0)
            *t = 55.5;
        printf("Yes ");
        }
    }
*/
void func(int signum)
    {
        printf("You cannot divide by zero!");
        exit(SIGFPE);
    }

 int main()
    {
        signal(SIGFPE, func);
        for (int j = -3; j <= 3; j++)
            printf("%d ", 12/j);
    }

    