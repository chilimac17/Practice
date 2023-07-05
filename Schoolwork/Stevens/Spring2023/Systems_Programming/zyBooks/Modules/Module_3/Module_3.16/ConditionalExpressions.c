#include <stdio.h>
#include <string.h>

int main(void) {
   int myNumber;
   int yourNumber;

   /**
    * @brief 
    * 
    * 
    *    if (condition) {
    *      myVar = expr1;
    *    }
    *    else {
    *      myVar = expr2;
    *    }
    *  
    *    myVar = (condition) ? expr1 : expr2;
    * 
    * 
    */

   myNumber = 3;
   yourNumber = (myNumber > 1) ? 9 : 2;

   printf("%d\n", yourNumber);

    char condStr[50];
   int userVal;

   scanf("%d", &userVal);

   strcpy(condStr, (userVal < 0) ? "negative" : "non-negative");

   printf("%d is %s.\n", userVal, condStr);

   int numUsers;
   int updateDirection;

   scanf("%d", &numUsers);
   scanf("%d", &updateDirection);

   /* Your solution goes here  */
   numUsers = (updateDirection > 0) ? numUsers + 1 : numUsers - 1;

   printf("New value is: %d\n", numUsers);

   return 0;
}