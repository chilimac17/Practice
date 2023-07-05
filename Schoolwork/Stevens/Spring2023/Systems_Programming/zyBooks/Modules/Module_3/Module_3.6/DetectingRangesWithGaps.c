#include <stdio.h>

int main() {
   int userAge;
   int movieTicketPrice;

   printf("Enter your age: ");
   scanf("%d", &userAge);

   if (userAge <= 12) {          // Age 12 and under
      printf("Child ticket discount.\n");
      movieTicketPrice = 11;
   }
   else if (userAge >= 65) {     // Age 65 and older
      printf("Senior ticket discount.\n");  
      movieTicketPrice = 12;
   }
   else {                        // All other ages
      movieTicketPrice = 14;
   }

   printf("Movie ticket price: $%d", movieTicketPrice);
   return 0;
}