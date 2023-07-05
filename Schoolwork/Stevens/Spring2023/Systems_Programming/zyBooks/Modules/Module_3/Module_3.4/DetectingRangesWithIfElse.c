#include <stdio.h>

int main(void) {
   int userAge;
   int insurancePrice;

   printf("Enter your age: ");
   scanf("%d", &userAge);

   if (userAge < 16) {             // Age 15 and under
      printf("Too young.\n");
      insurancePrice = 0;
   }
   else if (userAge < 25) {        // Age 16 - 24
      insurancePrice = 4800;
   }
   else if (userAge < 40) {        // Age 25 - 39
      insurancePrice = 2350;
   }
   else {                          // Age 40 and up
      insurancePrice = 2100;
   }

   printf("Annual price: $%d\n", insurancePrice);

   userAge = 0;
      scanf("%d", &userAge); // Program will be tested with values: 18, 19, 20, 21.

   if (userAge >= 20) {
      printf("I am an adult\n");
   }
   else {
      printf("I am a teenager\n");
   }

     int userItems;
   int userPoints;

   scanf("%d", &userItems); // Program will be tested with values: 18, 19, 20, 21.
   userPoints = 0;

   if (userItems >= 20) {
      userPoints = 10;
   }
   else {
      userPoints = 0;
   }

   printf("%d\n", userPoints);

      int givenYear;

   scanf("%d", &givenYear);

   /* Your solution goes here  */
   if(givenYear >= 2101){
    printf("Distant future\n");  
   }
   else if(givenYear >= 2001){
      printf("21st century\n");
   }else if(givenYear >= 1901){
      printf("20th century\n");
   }else{
      printf("Long ago\n");  
   }

   return 0;
}