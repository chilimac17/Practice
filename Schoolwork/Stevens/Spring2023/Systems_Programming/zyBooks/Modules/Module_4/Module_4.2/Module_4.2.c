#include <stdio.h>


/**
 * @brief 
 * while (expression) { Loop expression
 * Loop body: Executes if expression evaluated to true 
 * After body, execution jumps back to the "while"
 * }
 * Statements that execute after the expression evaluates to false
 * @return int 
 */

int main(void) {
  int currPower;
  char userChar;
 
  currPower = 2;
  userChar = 'y';
 
  while (userChar == 'y') {
     printf("%d\n", currPower);
     currPower = currPower * 2;
     scanf("%c", &userChar);
  }
 
  printf("Done\n");

   double celsiusValue;
   double fahrenheitValue;
   char userChar1;

   celsiusValue = 0.0;
   userChar1 = 'y';
   
   while (userChar1 == 'y') {
      fahrenheitValue = (celsiusValue * 9.0 / 5.0) + 32.0;

      printf("%lf C is ", celsiusValue);
      printf("%lf F\n", fahrenheitValue); 

      printf("Type y to continue, any other to quit: ");
      scanf(" %c", &userChar1);

      celsiusValue = celsiusValue + 5;
      printf("\n");
   }

   printf("Goodbye.\n");

   const int YEARS_PER_GEN = 20; // Approx. years per generation
   int userYear;                 // User input
   int consYear;                 // Year being considered
   int numAnc;                   // Approx. ancestors in considered year
   
   consYear = 2020;
   numAnc = 2;

   printf("Enter a past year (neg. for B.C.): ");
   scanf("%d", &userYear);
   
   while (consYear >= userYear) {
      printf("Ancestors in %d: %d\n", consYear, numAnc);
      
      numAnc = 2 * numAnc;                 // Each ancestor had two parents
      consYear = consYear - YEARS_PER_GEN; // Go back 1 generation
   }
 
   int userNum;

   scanf("%d", &userNum);

   /* Your solution goes here  */
   while(userNum > 1){
      userNum = userNum / 2;
      printf("%d ", userNum);
   }

   printf("\n");

  return 0;
}