#include <string.h>
#include <stdio.h>

// Output GCD of user-input numA and numB

int main(void) {
   int numA;  // User input
   int numB;  // User input
   
   printf("Enter first positive integer: ");
   scanf("%d", &numA);
   
   printf("Enter second positive integer: ");
   scanf("%d", &numB);
   
   while (numA != numB) { // Euclid's algorithm
      if (numB > numA) {
         numB = numB - numA;
      }
      else {
         numA = numA - numB;
      }
   }
   
   printf("GCD is: %d\n", numA);

   /* Program that has a conversation with the user. 
   Uses a if-else statements and a random number (sort of) 
   to mix up the program's responses. */

     const int TEXT_LIMIT = 1000;    // Size limit for user input
  char userText[TEXT_LIMIT];      // User input
  int rand0_3;                    // Random number 0 - 3

  printf("Tell me something about yourself.\n");
  printf("You can type \"Goodbye\" at anytime to quit.\n\n> ");
  
  fgets(userText, TEXT_LIMIT, stdin);    // Reads a full line of text
  userText[strlen(userText) - 1] = '\0'; // Replaces the newline character

  while (strcmp(userText, "Goodbye") != 0) {
    rand0_3 = strlen(userText) % 4;      // "Random" num. %4 ensures 0-3

    if (rand0_3 == 0) {
      printf("\nPlease explain further.\n\n> ");
    }
    else if (rand0_3 == 1) {
      printf("\nWhy do you say: \"%s\"?\n\n> ", userText);
    }
    else if (rand0_3 == 2) {
      printf("\nI don't think that's right.\n\n> ");
    }
    else if (rand0_3 == 3) {
      printf("\nWhat else can you share?\n\n> ");
    }
    else {
      printf("\nUh-oh, something went wrong. Try again.\n\n");
    }

    fgets(userText, TEXT_LIMIT, stdin);
    userText[strlen(userText)-1] = '\0';
  }
  
  printf("\nIt was nice talking with you. Goodbye.\n\n");

  // Outputs average of list of positive integers
 // List ends with 0 (sentinel)
// Ex: 10 1 6 3 0  yields (10 + 1 + 6 + 3) / 4, or 5

   int currValue;
   int valuesSum;
   int numValues;

   valuesSum = 0;
   numValues = 0;

   scanf("%d", &currValue);
   
   while (currValue > 0) { // Get values until 0 (or less)
      valuesSum = valuesSum + currValue;
      numValues = numValues + 1;
      scanf("%d", &currValue);
   }

   printf("Average: %d\n", valuesSum / numValues);

      char keepBidding;
   int nextBid;

   nextBid = 0;
   keepBidding = 'y';

   while (keepBidding != 'n') {
      nextBid = nextBid + 3;
      printf("I'll bid $%d!\n", nextBid);
      printf("Continue bidding? (y/n) ");
      scanf(" %c ", &keepBidding);
   }
   printf("\n");

      int numInsects;

   scanf("%d", &numInsects); // Must be >= 1

   /* Your solution goes here  */
   while(numInsects < 100){
      printf("%d ",numInsects);
      numInsects *= 2;
   }
   printf("\n");
   
   return 0;
}