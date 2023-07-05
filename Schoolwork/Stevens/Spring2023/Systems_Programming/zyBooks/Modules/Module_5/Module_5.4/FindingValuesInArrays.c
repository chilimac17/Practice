#include <stdio.h>

int main(void) {
   const int NUM_VALS = 4;
   int userValues[NUM_VALS];
   int i;
   int matchValue;
   int numMatches = -99; // Assign numMatches with 0 before your for loop

   scanf("%d", &matchValue);

   for (i = 0; i < NUM_VALS; ++i) {
      scanf("%d", &(userValues[i]));
   }

   /* Your solution goes here  */
   numMatches = 0;
   for(int j =0; j < NUM_VALS; j++)
   {
      if(matchValue == userValues[j])
      {
         numMatches++;
      }
   }

   printf("matchValue: %d, numMatches: %d\n", matchValue, numMatches);

   return 0;
}