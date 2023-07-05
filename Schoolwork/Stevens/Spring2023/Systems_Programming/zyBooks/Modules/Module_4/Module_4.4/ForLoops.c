
#include <stdio.h>

/**
 * @brief 
 * for (initialExpression; conditionExpression; updateExpression) {
 *  Loop body
 * }
 * Statements after the loop
 * @return int 
 */

int main(void) {
   double initialSavings;  // User-entered initial savings
   double interestRate;    // Interest rate
   double currSavings;     // Current savings with interest
   int i;                  // Loop variable

   printf("Enter initial savings: ");
   scanf("%lf", &initialSavings);

   printf("Enter interest rate: ");
   scanf("%lf", &interestRate);

   printf("\nAnnual savings for 10 years: \n");

   currSavings = initialSavings;
   for (i = 0; i < 10; ++i) {
      printf("$%lf\n", currSavings);
      currSavings = currSavings + (currSavings * interestRate);
   }


// Outputs average of list of integers
// First value indicates list size
// Ex: 4  10 1 6 3  yields (10 + 1 + 6 + 3) / 4, or 5
   int currValue;
   int valuesSum;
   int numValues;
   int i;

   scanf("%d", &numValues); // Gets number of values in list

   valuesSum = 0;

   for (i = 0; i < numValues; ++i) {
      scanf("%d", &currValue); // Gets next value in list
      valuesSum += currValue;
   }

   printf("Average: %d\n", (valuesSum / numValues));

   return 0;
}