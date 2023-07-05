
#include <stdio.h>
#include <ctype.h>

/**
 * @brief 
 * toupper(c) -- If c is a lowercase alphabetic character (a-z), returns the uppercase version (A-Z). If c is not a lowercase alphabetic character, just returns c.	
letter = toupper(myString[0]);  // Returns 'H' (no change) 
letter = toupper(myString[1]);  // Returns 'E' ('e' converted to 'E') 
letter = toupper(myString[3]);  // Returns '9' (no change) 
letter = toupper(myString[5]);  // Returns ' ' (no change)
tolower(c) -- If c is an uppercase alphabetic character (A-Z), returns the lowercase version (a-z). If c is not an uppercase alphabetic character, just returns c.	
letter = tolower(myString[0]);  // Returns 'h' ('H' converted to 'h')
letter = tolower(myString[1]);  // Returns 'e' (no change)
letter = tolower(myString[3]);  // Returns '9' (no change) 
letter = tolower(myString[5]);  // Returns ' ' (no change)
 * @return int 
 */

int main(void) {
   const int MAX_LEN = 30; // Max string length
   char userStr[MAX_LEN]; // User defined string
   int i;
   
   // Prompt user to enter string
   printf("Enter string (<%d chars): ", MAX_LEN);
   scanf("%s", userStr);
   
   printf("Original: %s\n", userStr);
   
   printf("isalpha:  ");
   for (i = 0; userStr[i] != '\0'; ++i) {
      printf("%d", isalpha(userStr[i]));
   }
   printf("\n");
   
   printf("isdigit:  ");
   for (i = 0; userStr[i] != '\0'; ++i) {
      printf("%d", isdigit(userStr[i]));
   }
   printf("\n");
   
   printf("isupper:  ");
   for (i = 0; userStr[i] != '\0'; ++i) {
      printf("%d", isupper(userStr[i]));
   }
   printf("\n");
   
   for (i = 0; userStr[i] != '\0'; ++i) {
      userStr[i] = toupper(userStr[i]);
   }
   printf("After toupper: %s\n", userStr);
   
   return 0;
}