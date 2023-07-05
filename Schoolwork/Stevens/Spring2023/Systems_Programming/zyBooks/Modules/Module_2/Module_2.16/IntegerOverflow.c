#include <stdio.h>

int main(void) {
   int num;

   num = 100;
   num = num * 100;
   printf("num: %d\n", num);

   num = num * 100;
   printf("num: %d\n", num);

   num = num * 100;
   printf("num: %d\n", num);

   return 0;
}