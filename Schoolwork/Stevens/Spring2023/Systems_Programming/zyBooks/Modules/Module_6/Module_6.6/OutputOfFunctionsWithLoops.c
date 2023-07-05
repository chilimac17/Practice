
#include <stdio.h>

int Compute(int val1, int val2) {
   int result = 0;
   int i;

   for (i = 0; i < val1; ++i) {
      result -= val2 * 2;
   }
   
   return result;
}

void PrintSelectedNumbers(int numCount) {
   int i;
   int number;

   for (i = 0; i < numCount; ++i) {
      scanf("%d", &number);
      if ((number % 3) == 0) {
         printf("%d\n", number);
      }
   }
}

int main(void) {
   int value1 = 3;
   int value2 = 1;
   int computedValue;

   computedValue = Compute(value1, value2);
   printf("%d\n", computedValue);

    int numCount = 7;

   PrintSelectedNumbers(numCount);
   
   return 0;
}