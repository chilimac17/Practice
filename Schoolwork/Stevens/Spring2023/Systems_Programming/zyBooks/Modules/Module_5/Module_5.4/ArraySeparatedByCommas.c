#include <stdio.h>

int main(void) {
   const int NUM_VALS = 4;
   int hourlyTemp[NUM_VALS];
   int i;

   for (i = 0; i < NUM_VALS; ++i) {
      scanf("%d", &(hourlyTemp[i]));
   }

   /* Your solution goes here  */
   for(i = 0; i < NUM_VALS; i++)
   {
      if(i == (NUM_VALS - 1))
      {
         printf("%d", hourlyTemp[i]);
      }else{
         printf("%d, ", hourlyTemp[i]);
      }
   }

   printf("\n");

   return 0;
}