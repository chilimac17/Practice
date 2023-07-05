#include <stdio.h>

void count_down(int n);

int main()

{

    //count_down(5);
    printf("START\n");
    printf("%d ", sum(5));

}

void count_down(int n)

{

if (n)

{

printf("%d ! ", n);

count_down(n - 1);

}

else

printf("Blast Off!\n");

}

int sum(int n)

{

if (n <= 1)

return n;

else

return (n + sum(--n));

}