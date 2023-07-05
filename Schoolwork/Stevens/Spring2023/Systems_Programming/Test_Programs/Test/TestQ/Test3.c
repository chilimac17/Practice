#include<stdio.h>

#define MAXLINE 500

 

int main (void) {

        char line[MAXLINE];

        int what, n;

 

do {

printf("Input a positive integer: ");

fgets(line, MAXLINE, stdin);

what = sscanf(line, "%d", &n) != 1 || n <= 0;

if (what)

printf("\nError: Do it again.\n");

} while (what);

}