#include <stdio.h>
#include <stdbool.h>

// Function to prompt for and input an integer
int PromptForInteger(const char userPrompt[]) {
   int inputValue;
   
   printf("%s: \n", userPrompt);
   scanf("%d", &inputValue);

   return inputValue;
}

// *************************************************************************

// Function to get a value from one table based on a range in the other table
double GetCorrespondingTableValue(int search, int baseTable[], double valueTable[], int tableSize) {
   double value;
   int i;
   bool keepLooking;

   i = 0;
   keepLooking = true;

   while ((i < tableSize) && keepLooking) {
      if (search <= baseTable[i]) {
         value = valueTable[i];
         keepLooking = false;
      }
      else {
         ++i;
      }
   }

   return value;
}

// **********************************************************************

int main(void) {
   const int BASE_TABLE_ELEMENTS = 5;
   const char USER_PROMPT[] = "\nEnter annual salary (negative to exit)";
   int annualSalary;
   double taxRate;
   int taxToPay;

   // The first entries in the two tables are 0 to catch annualSalary < 0
   int salaryBase[] = {   0,    20000,    50000,    100000,    999999999 };
   double taxBase[] = { 0.0,     0.10,     0.20,      0.30,         0.40 };

   annualSalary = PromptForInteger(USER_PROMPT);

   while(annualSalary >= 0) {
      taxRate = GetCorrespondingTableValue(annualSalary, salaryBase, 
                                           taxBase, BASE_TABLE_ELEMENTS);

      taxToPay = (int)(annualSalary * taxRate);    // Truncate tax to an integer amount
      printf("Annual salary: %d", annualSalary);
      printf("\nTax rate: %lf", taxRate);
      printf("\nTax to pay: %d\n", taxToPay);
    
      // Get the next annual salary
      annualSalary = PromptForInteger(USER_PROMPT);
   }

   return 0;
}
