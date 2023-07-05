#include <stdio.h>

int main(void) {
   char phoneChar;   // Current char in phone number string

   printf("Enter phone number: \n");

   scanf("%c", &phoneChar);  // Reads first char of user input
   printf("Numbers only: ");

   while (phoneChar != '\n') {

      if (((phoneChar >= '0') && (phoneChar <= '9')) || (phoneChar == '-')) {
         printf("%c", phoneChar); // Print element as is
      }
      else if ( ((phoneChar >= 'a') && (phoneChar <= 'c')) ||
                ((phoneChar >= 'A') && (phoneChar <= 'C')) ) {
         printf("2");
      }
      // FIXME: Add remaining else-if branches
      else {
         printf("?");
      }

      scanf("%c", &phoneChar);  // Read next char of user input
   }

   printf("\n");

   return 0;
}
