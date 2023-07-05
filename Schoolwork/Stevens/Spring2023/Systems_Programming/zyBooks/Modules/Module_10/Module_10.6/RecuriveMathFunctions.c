#include <stdio.h>

int RaiseToPower(int baseVal, int exponentVal){
   int resultVal;

   if (exponentVal == 0) {
      resultVal = 1;
   }
   else {
      resultVal = baseVal * RaiseToPower(baseVal,exponentVal - 1);
   }

   return resultVal;
}

/* Determine the greatest common divisor
   of two numbers, e.g. GCD(8, 12) = 4
*/
int GCDCalculator(int inNum1, int inNum2) {
   int gcdVal;     // Holds GCD results
   
   if(inNum1 == inNum2) {    // Base case: Numbers are equal
      gcdVal = inNum1;       // return value
   }
   else {                    // Recursive case: subtract smaller from larger
      if (inNum1 > inNum2) { // call function with new values
         gcdVal = GCDCalculator(inNum1 - inNum2, inNum2);
      }
      else {
         gcdVal = GCDCalculator(inNum1, inNum2 - inNum1);
      }
   }
   
   return gcdVal;
}

/* Output the Fibonacci sequence step-by-step.
   Fibonacci sequence starts as:
   0 1 1 2 3 5 8 13 21 ... in which the first
   two numbers are 0 and 1 and each additional
   number is the sum of the previous two numbers
*/

void ComputeFibonacci(int fibNum1, int fibNum2, int runCnt) {
   
   printf("%d + %d = %d\n", fibNum1, fibNum2, fibNum1 + fibNum2);
   
   if (runCnt <= 1) { // Base case: Ran for user specified
                      // number of steps, do nothing
   }
   else {            // Recursive case: compute next value
      ComputeFibonacci(fibNum2, fibNum1 + fibNum2, runCnt - 1);
   }
}

int main(void) {
   int runFor;     // User specified number of values computed

   // Output program description
   printf("This program outputs the\n");
   printf("Fibonacci sequence step-by-step,\n");
   printf("starting after the first 0 and 1.\n\n");

   // Prompt user for number of values to compute
   printf("How many steps would you like? ");
   scanf("%d", &runFor);
   
   // Output first two Fibonacci values, call recursive function
   printf("0\n1\n");
   ComputeFibonacci(0, 1, runFor);

      int gcdInput1;     // First input to GCD calc
   int gcdInput2;     // Second input to GCD calc
   int gcdOutput;     // Result of GCD
   
   // Print program function
   printf("This program outputs the greatest \n");
   printf("common divisor of two numbers.\n");
   
   // Prompt user for input
   printf("Enter first number: ");
   scanf("%d", &gcdInput1);
   
   printf("Enter second number: ");
   scanf("%d", &gcdInput2);
   
   // Check user values are > 1, call recursive GCD function
   if ((gcdInput1 < 1) || (gcdInput2 < 1)) {
      printf("Note: Neither value can be below 1.\n");
   }
   else {
      gcdOutput = GCDCalculator(gcdInput1, gcdInput2);
      printf("Greatest common divisor = %d\n", gcdOutput);
   }

   int userBase;
   int userExponent;

   scanf("%d", &userBase);
   scanf("%d", &userExponent);
   printf("%d^%d = %d\n", userBase, userExponent, RaiseToPower(userBase, userExponent));
   
   return 0;
}