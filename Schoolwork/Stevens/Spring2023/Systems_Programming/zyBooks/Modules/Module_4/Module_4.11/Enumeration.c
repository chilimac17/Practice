#include <stdio.h>

/* Manual controller for traffic light */
int main(void) {
   enum LightState {LS_RED, LS_GREEN, LS_YELLOW, LS_DONE};
   enum LightState lightVal;
   char userCmd;

   lightVal = LS_RED;
   userCmd = '-';

   printf("User commands: n (next), r (red), q (quit).\n\n");

   lightVal = LS_RED;
   while (lightVal != LS_DONE) {
      
      if (lightVal == LS_GREEN) {
         printf("Green light  ");
         scanf(" %c", &userCmd);
         if (userCmd == 'n') { // Next
            lightVal = LS_YELLOW;
         }
      }
      else if (lightVal == LS_YELLOW) {
         printf("Yellow light  ");
         scanf(" %c", &userCmd);
         if (userCmd == 'n') { // Next
            lightVal = LS_RED;
         }
      }
      else if (lightVal == LS_RED) {
         printf("Red light  ");
         scanf(" %c", &userCmd);
         if (userCmd == 'n') { // Next
            lightVal = LS_GREEN;
         }
      }
      
      if (userCmd == 'r') { // Force immediate red
         lightVal = LS_RED;
      }
      else if (userCmd == 'q') { // Quit
         lightVal = LS_DONE;
      }
   }
   
   printf("Quit program.\n");

      enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER};
   enum GroceryItem userItem;

   userItem = GR_APPLES;

   /* Your solution goes here  */
   if(userItem == 0 || userItem == 1){
      printf("Fruit\n");
   }else if(userItem == 2 || userItem == 3){
      printf("Drink\n");
   }else{
      printf("Unknown\n");  
   }

      enum AcceptedCoins {ADD_QUARTER, ADD_DIME, ADD_NICKEL, ADD_UNKNOWN};
   int totalDeposit = 0;
   int userInput;

   printf("Add coin: 0 (add 25), 1 (add 10), 2 (add 5).  ");
   scanf("%d", &userInput);

   if (userInput == ADD_QUARTER) {
      totalDeposit = totalDeposit + 25;
   }

   /* Your solution goes here  */
   else if (userInput == ADD_DIME) {
      totalDeposit = totalDeposit + 10;
   }
  else if (userInput == ADD_NICKEL) {
      totalDeposit = totalDeposit + 5;
   }
     else if (userInput == ADD_UNKNOWN) {
      totalDeposit = totalDeposit + 0;
   }
   else {
      printf("Invalid coin selection.\n");
   }

   printf("totalDeposit: %d\n", totalDeposit);

   return 0;
}