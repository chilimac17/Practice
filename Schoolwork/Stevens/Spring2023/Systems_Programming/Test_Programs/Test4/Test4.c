#include <stdio.h>

void count_down(int n)

{

if (n)

{

count_down(n - 1);

printf("%d ! ", n);

}

else

printf("Blast Off!");

}

int main()

{

count_down(5);

}