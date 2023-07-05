#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <ctype.h>

int main(void) {
   char let0;
   char let1;

   printf("Enter a two-letter state abbreviation: ");
   scanf("%c", &let0);
   scanf("%c", &let1);

   if ( ! (isalpha(let0) && isalpha(let1)) ) {
      printf("Error: Both are not letters.\n");
   }
   else {
      let0 = toupper(let0);
      let1 = toupper(let1);
      printf("Capitalized: %c%c\n", let0, let1);
   }


   bool hasDigit;
   char passCode[50];

   hasDigit = false;
   scanf("%s", passCode);

   /* Your solution goes here  */
   if(isdigit(passCode[0])||isdigit(passCode[1]) ||isdigit(passCode[2])){
      hasDigit = true;
   }

   if (hasDigit) {
      printf("Has a digit.\n");
   }
   else {
      printf("Has no digit.\n");
   }

    char passCode1[3];

   scanf("%s", passCode1);

   /* Your solution goes here  */
   if(isalpha(passCode1[0])){
      passCode1[0] = '_';
   }  
   if(isalpha(passCode1[1])){
       passCode1[1] = '_';
   }

   printf("%s\n", passCode1);
   return 0;
}