#include<sys/types.h>
#include<signal.h>
#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>

void func1(int signum);

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
            printf(“Yes ”);
        }
    }

    void func1(int signum)
    {
        printf(“No”);
        exit(SIGSEGV);
    }