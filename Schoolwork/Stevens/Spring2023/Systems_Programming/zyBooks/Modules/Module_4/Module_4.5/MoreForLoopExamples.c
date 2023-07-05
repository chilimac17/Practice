
#include <stdio.h>

/* Outputs max of list of integers
   First value indicates list size
   Ex: 4 -1 9 0 3  yields 9
*/


int main(void) {
   int maxSoFar;
   int currValue;
   int numValues;
   int i;

   scanf("%d", &numValues);

   for (i = 0; i < numValues; ++i) {
      scanf("%d", &currValue);

      if (i == 0) { // First iteration
         maxSoFar = currValue;
      }
      else if (currValue > maxSoFar) {
         maxSoFar = currValue;
      }
   }

   if (numValues > 0) {
      printf("Max: %d\n", maxSoFar);
   }

   int currC;
   double equivalentF;
  
   for (currC = -10; currC <= 40; currC += 5) {
      equivalentF = (currC * 9.0 / 5.0) + 32.0;
      
      printf("%d  C is ", currC);
      printf("%lf F\n", equivalentF);
   }

   return 0;
}