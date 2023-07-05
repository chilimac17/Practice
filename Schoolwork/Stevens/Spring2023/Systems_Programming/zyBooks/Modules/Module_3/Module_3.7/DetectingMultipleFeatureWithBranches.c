
#include <stdio.h>

int main(void) {
   int userAge;
   
   printf("Enter age: ");
   scanf("%d", &userAge);
   
   // Note that more than one "if" statement can execute
   if (userAge < 16) {
      printf("Enjoy your early years.\n");
   }
   
   if (userAge > 15) {
      printf("You are old enough to drive.\n");
   }
   
   if (userAge > 17) {
      printf("You are old enough to vote.\n");
   }
   
   if (userAge > 24) {
      printf("Most car rental companies will rent to you.\n");
   }
   
   if (userAge > 34) {
      printf("You can run for president.\n");
   }

      int numItems;
   
   numItems = 6;

   if (numItems > 3) {
      printf("c\n");
   }

   if (numItems < 9) {
      printf("d\n");
   }

   if (numItems == 6) {
      printf("g\n");
   }
   
   printf("p\n");

      int carYear;

   scanf("%d", &carYear);

   /* Your code goes here */
   if(carYear < 1967){
      printf("Probably has few safety features.\n");
   }
   if(carYear > 1971){
      printf("Probably has head rests.\n");
   }
    if(carYear > 1990){
      printf("Probably has anti-lock brakes.\n");
   }
       if(carYear > 2001){
      printf("Probably has tire-pressure monitor.\n");
   }

      int userNum1;
   int userNum2;

   scanf("%d", &userNum1);
   scanf("%d", &userNum2);

   /* Your code goes here */
   if(userNum1 < 0 )
   {
      printf("userNum1 is negative.\n");
   }
   if(userNum2 > 9 )
   {
      userNum2 = 1; 
   }
   else
   {
      printf("userNum2 is less than or equal to 9.\n");
   }

   printf("userNum2 is %d.\n", userNum2);
   
   return 0;
}