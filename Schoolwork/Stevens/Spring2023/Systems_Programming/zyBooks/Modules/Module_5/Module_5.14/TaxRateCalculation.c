#include <stdio.h>
#include <stdbool.h>

/**
 * @brief 
 * Arrays are useful to process tabular information. Income taxes are based on annual salary, usually with a tiered approach. Below is an example of a simple tax table:

Annual Salary	Tax Rate
0 to 20000	10%
Above 20000 to 50000	20%
Above 50000 to 100000	30%
Above 100000	40%

The below program uses an array salaryBase to hold the cutoffs for each salary level and a parallel array taxBase that has the corresponding tax rate.

Run the program and enter annual salaries of 40000 and 60000, then enter 0.
Modify the program to use two parallel arrays named annualSalaries and taxesToPay, each with 10 elements. Array annualSalaries holds up to 10 annual salaries entered; array taxesToPay holds up to 10 corresponding amounts of taxes to pay for those annual salaries. Print the total annual salaries and taxes to pay after all input has been processed.
Run the program again with the same annual salary numbers as above.
Challenge: Modify the program from the previous step to use a 2-dimensional array of 10 elements named salariesAndTaxes instead of two one-dimensional parallel arrays. The 2D array's first column will hold the salaries, the second the taxes to pay for each salary.
 * @return int 
 */

int main(void) {
   const int BASE_TABLE_ELEMENTS = 5;
   const int MAX_ELEMENTS = 10;
   int annualSalary;
   double taxRate;
   int taxToPay;
   int totalSalaries;
   int totalTaxes;
   int numSalaries;
   bool keepLooking;
   int i;

   int salaryBase[] = { 20000,     50000,     100000,    999999999 };
   double taxBase[] = {   .10,       .20,        .30,          .40 };
   int annualSalaries[MAX_ELEMENTS];
   int taxesToPay[MAX_ELEMENTS];

   numSalaries = 0;

   printf("\nEnter annual salary (0 to exit): \n");
   scanf("%d", &annualSalary);

   while ((annualSalary > 0) && (numSalaries < MAX_ELEMENTS)) {
      i = 0;
      taxRate = 0;
      keepLooking = true;

      // Search for appropriate table row for given annualSalary
      while ((i < BASE_TABLE_ELEMENTS) && keepLooking) {
         if (annualSalary <= salaryBase[i]) {
            taxRate = taxBase[i];
            keepLooking = false;
         }
         else {
            ++i;
         }
      } // End inner while loop (search for appropriate table row)

      taxToPay = (int)(annualSalary * taxRate); // Truncate tax to an integer amount
      annualSalaries[numSalaries] = annualSalary;
      taxesToPay[numSalaries] = taxToPay;

      printf("Annual salary: %d", annualSalaries[numSalaries]);
      printf("\tTax rate: %lf", taxRate);
      printf("\tTax to pay: %d\n", taxesToPay[numSalaries]);
      ++numSalaries;

      // Get the next annual salary
      printf("\nEnter annual salary (0 to exit): \n");
      scanf("%d", &annualSalary);
   } // End outer while loop (valid annualSalary entered)
   
   // Sum the annual salaries and taxes to pay and print the totals
   totalSalaries = 0;
   totalTaxes = 0;

   for (i = 0; i < numSalaries; ++i) {
      totalSalaries += annualSalaries[i];
      totalTaxes    += taxesToPay[i];
   }
   printf("\nTotal salaries: %d", totalSalaries);
   printf("\tTotal taxes: %d\n", totalTaxes);

   return 0;
}