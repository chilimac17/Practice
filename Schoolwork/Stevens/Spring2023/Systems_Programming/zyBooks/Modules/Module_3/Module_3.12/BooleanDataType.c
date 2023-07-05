#include <stdio.h>
#include <stdbool.h>

int main(void) {
   int waitTime;
   int partySize;
   char day;
   bool isLargeParty;
   bool isWeekend;
   
   // Get day of reservation
   printf("Day of reservation (T/W/R/F/S/U): ");
   scanf("%c", &day);
   if (day == 'F' || day == 'S' || day == 'U') {
      isWeekend = true;
   }
   else {
      isWeekend = false;
   }
   
   // Get party size
   printf("Enter party size: ");
   scanf("%d", &partySize);
   isLargeParty = (partySize > 6);
   
   // Determine wait time based on day of week and party size
   if (isWeekend && !isLargeParty) {
      waitTime = 30;
   }
   else if (!isWeekend && !isLargeParty) {
      waitTime = 10;
   }
   else if (isWeekend && isLargeParty) {
      waitTime = 45;
   }
   else {
      waitTime = 15;
   }
   
   printf("Restaurant wait time is %d minutes.\n", waitTime);
   

      bool isTeenager;
   int kidAge;

   scanf("%d", &kidAge);

   /* Your solution goes here  */
   if(kidAge >= 13 && kidAge <= 19){
      isTeenager = true;
   }else{
        isTeenager = false;
   }

   if (isTeenager) {
      printf("Teen\n");
   }
   else {
      printf("Not teen\n");
   }


   int userNum;
   bool isPositive;
   bool isEven;

   scanf("%d", &userNum);
   isPositive = (userNum > 0);
   isEven = ((userNum % 2) == 0);

   /* Your solution goes here  */
   if(isEven && isPositive){
      printf("Positive even number\n");
   } else if(!isEven && isPositive){
        printf("Positive number\n");
   }else{
      printf("Not a positive number\n");  
   }
   return 0;
}