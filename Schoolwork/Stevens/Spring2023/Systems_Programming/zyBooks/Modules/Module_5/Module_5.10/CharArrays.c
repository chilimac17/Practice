
#include <stdio.h>

int main(void) {
   char cityName[20] = "Forest Lake"; // Compiler appends null char

   // In each printf(), printing stops when reaching null char
   printf("%s\n", "City:");           // Compiler appends null char to "City:"
   printf("%s\n", cityName);

      char userStr[20] = "1234567890123456789"; // Input string
   int i;
   
   // Prompt user for string input
   printf("Enter string (<20 chars): ");
   scanf("%s", userStr);
   
   // Print string
   printf("\n%s\n", userStr);
   
   // Look for '@'
   for (i = 0; userStr[i] != '\0'; ++i) {
      if (userStr[i] == '@') {
         printf("Found '@'.\n");
      }
   }
   
   
   // The following is an ERROR.
   // May print chars it shouldn't.
   // Problem: doesn't stop at null char.
   printf("\n\""); // Print opening "
   for (i = 0; i < 20; ++i) { // Print each char
      printf("%c", userStr[i]);
   }
   printf("\"\n"); // Print closing "
   
   
   // The following is an even WORSE ERROR.
   // Accesses beyond valid index range.
   // Program may crash.
   printf("\""); // Print opening "
   for (i = 0; i < 30; ++i) {
      printf("%c", userStr[i]); // Print each char
   }
   printf("\"\n");              // Print closing "

      char nameArr[9];

   nameArr[0] = 'A';
   nameArr[1] = 'l';
   nameArr[2] = 'a';
   nameArr[3] = 'n';
   nameArr[4] = '\0'; // Null character

   printf("%s\n", nameArr);

   nameArr[4] = '!';        // Oops, overwrote null char
   printf("%s\n", nameArr); // *Might* still work

   return 0;
}