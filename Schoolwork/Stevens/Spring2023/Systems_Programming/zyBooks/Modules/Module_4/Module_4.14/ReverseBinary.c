//Michael Chillemi
#include <stdio.h>
#include <string.h>
int main(void) {
   
   //Variables
   int userInput;
   int nextNum = 0;
   int count = 0;
   char stringHolder[10];
   char reverseBinary[20];
   
   //User Input
   scanf("%d", &userInput);
   
   while(userInput > 0 ){
      nextNum = userInput % 2;
      userInput /= 2;

      sprintf(stringHolder, "%d", nextNum);
      strcat(reverseBinary,stringHolder);
      if(count ==0){
       strcpy(reverseBinary, stringHolder);  
      }
      printf("Reverse Binary = %s Count = %d StringHolder = %s\n", reverseBinary, count, stringHolder);
      count++;
   }

   printf("%s\n", reverseBinary);
   
    /**
     * @brief 
     * In order to convert the number to binary you must loop through reverseBinary starting at the end to get the actual binary of a number 
     */

   return 0;
}
