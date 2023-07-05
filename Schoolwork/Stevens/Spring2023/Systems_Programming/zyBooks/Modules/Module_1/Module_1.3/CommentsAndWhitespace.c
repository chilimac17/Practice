#include <stdio.h>

/*
 This program calculates the amount of pasta to cook, given the
 number of people eating.
 
 */

int main(void) {
   int numPeople;         // Number of people that will be eating
   int totalOuncesPasta;  // Total ounces of pasta to serve numPeople
   
   // Get number of people
   printf("Enter number of people: \n");
   scanf("%d", &numPeople);
   
   // Calculate and print total ounces of pasta
   totalOuncesPasta = numPeople * 3;  // Typical ounces per person
   printf("Cook %d ounces of pasta.\n", totalOuncesPasta);

   int myFirstVar;    // Aligned comments yield less
   int yetAnotherVar; // visual clutter 
   int thirdVar;
   
   // Above blank line separates variable declarations from the rest
   printf("Enter a number: ");
   scanf("%d", &myFirstVar); 
   
   // Above blank line separates user input statements from the rest
   yetAnotherVar = myFirstVar;        // Aligned = operators
   thirdVar      = yetAnotherVar + 1; 
   // Also notice the single-space on left and right of + and =
   // (except when aligning the second = with the first =)
   
   printf("Final value is %d\n", thirdVar); // Single-space after the ,

   int userAge;
   int currentDecade;
   int nextDecade;
   int nextMilestone;
   
   printf("Enter your age: \n");
   scanf("%d", &userAge);
   
   currentDecade=userAge/10;
   nextDecade = currentDecade + 1;
   nextMilestone = nextDecade * 10;
   printf("Next big birthday is at %d\n", nextMilestone);



   
   return 0;
}