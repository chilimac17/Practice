
#include <stdio.h>

int main(void) {
    int userAge;
 
   printf("Enter your age: ");
   scanf("%d", &userAge);
   printf("%d", userAge);
   printf(" is a great age.\n");
   
   int litterSize;
   int yearlyLitters;
   int annualMice;
   
   litterSize    = 3; // Low end of litter size range
   yearlyLitters = 5; // Low end of litters per year
   
   printf("One female mouse may give birth to ");
   annualMice = litterSize * yearlyLitters;
   printf("%d mice,\n", annualMice);
   
   litterSize    = 14; // High end
   yearlyLitters = 10; // High end

   printf("and up to ");
   annualMice = litterSize * yearlyLitters;
   printf("%d mice, in a year.\n", annualMice);

   int avgLifespan = 70;
   int userAge;

   printf("Enter your age: ");
   scanf("%d", &userAge);
   printf("%d is a great age\n", userAge);

   printf("Average lifespan is %d\n", avgLifespan);

   int yourFriends;
   int totalFriends;
            
   printf("Enter the number of people you know: ");
   scanf("%d",  &yourFriends);
   totalFriends = yourFriends;
   printf(" You know %d people.\n", totalFriends);
   totalFriends = totalFriends * yourFriends;
   printf(" Those people know %d people.\n", totalFriends);
   totalFriends = totalFriends * yourFriends;
   printf(" And they know %d people.\n\n", totalFriends);
   
   return 0;
}