#include <stdio.h>

// Returns number of pennies if pennies are doubled numDays times
long long DoublePennies(long long numPennies, int numDays){
   long long totalPennies;

   /* Your solution goes here  */
   if(numDays == 1)
   {
      totalPennies = numPennies * 2;
   }

   else {
     totalPennies = DoublePennies((numPennies * 2), numDays - 1);
     }

   return totalPennies;
}

void PrintFactorial(int factCounter, int factValue){
   int nextCounter;
   int nextValue;

   if (factCounter == 0) {            // Base case: 0! = 1
      printf("1\n");
   }
   else if (factCounter == 1) {       // Base case: Print 1 and result
      printf("%d = %d\n", factCounter, factValue);
   }
   else {                             // Recursive case
      printf("%d * ", factCounter);
      nextCounter = factCounter - 1;
      nextValue = nextCounter * factValue;

      /* Your solution goes here  */
      PrintFactorial(nextCounter,nextValue);

   }
}

// Program computes pennies if you have 1 penny today,
// 2 pennies after one day, 4 after two days, and so on
int main(void) {
   long long startingPennies;
   int userDays;

   scanf("%lld", &startingPennies);
   scanf("%d", &userDays);
   printf("Number of pennies after %d days: %lld\n", userDays, DoublePennies(startingPennies, userDays));


   int userVal;

   scanf("%d", &userVal);
   printf("%d! = ", userVal);
   PrintFactorial(userVal, userVal);
   
   return 0;
}