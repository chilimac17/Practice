#include <stdio.h>

int main(void) {
  int hotelRate;
  int numYears;

  hotelRate = 150;

  printf("Enter number of years married: ");
  scanf("%d", &numYears);

  if (numYears == 50) {
     printf("Congratulations on 50 years ");
     printf("of marriage!\n");

     hotelRate = hotelRate / 2;
  }

  printf("Your hotel rate: ");
  printf("%d\n", hotelRate);

     int userNum;
   int divRemainder;

   printf("Enter a number: ");
   scanf("%d", &userNum);

   divRemainder = userNum % 2;

   if (divRemainder == 0) {
       printf("%d is even.\n", userNum);
   }
   else {
       printf("%d is odd.\n", userNum);
   }
   int numApples;

   numApples = 5;
   
   if (numApples != 5) {
      printf("b\n");
   }
   else {
      printf("e\n");
   }
   
   printf("g\n");

      int awardPoints;
   int userTickets;

   scanf("%d", &userTickets); // Program will be tested with values: 5, 6, 7, 8.

   /* Your code goes here */
   if(userTickets == 8 ){
      awardPoints = 1;
   }else{
      awardPoints = userTickets;
   }

   printf("%d\n", awardPoints);

      int totalDifference;
   int numDifference;

   scanf("%d", &numDifference); // Program will be tested with values: -14, -15, -16, -17.

   /* Your code goes here */
   if(numDifference == -16){
      totalDifference = -25;
   }else{
      totalDifference = numDifference;
   }

   printf("%d", totalDifference);
   /*
    if (expression1) {
        Statements that execute when expression1 is true
        (first branch)
    }
    else if (expression2) {
        Statements that execute when expression1 is false and expression2 is true
        (second branch)
    }
    else {
        Statements that execute when expression1 is false and expression2 is false
        (third branch)

   */
    int numYears1;
   
   printf("Enter number years married: ");
   scanf("%d", &numYears1);
   
   if (numYears1 == 1) {
      printf("Your first year -- great!\n");
   }
   else if (numYears1 == 10) {
      printf("A whole decade -- impressive.\n");
   }
   else if (numYears1 == 25) {
      printf("Your silver anniversary -- enjoy.\n");
   }
   else if (numYears1 == 50) {
      printf("Your golden anniversary -- amazing.\n");
   }
   else {
      printf("Nothing special.\n");
   }
   


  return 0;
