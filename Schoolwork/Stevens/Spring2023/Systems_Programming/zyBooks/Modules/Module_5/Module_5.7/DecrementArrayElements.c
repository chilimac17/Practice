#include <stdio.h>

int main(void) {
   const int SCORES_SIZE = 4;
   int lowerScores[SCORES_SIZE];
   int i;

   for (i = 0; i < SCORES_SIZE; ++i) {
      scanf("%d", &(lowerScores[i]));
   }

   /* Your solution goes here  */
   for(i = 0; i < SCORES_SIZE; i++)
   {
      if(lowerScores[i] >  0 )
      {
         lowerScores[i] = lowerScores[i] - 1;
      }else{
         lowerScores[i] = 0;
      }
   }

   for (i = 0; i < SCORES_SIZE; ++i) {
      printf("%d ", lowerScores[i]);
   }
   printf("\n");

   return 0;
}