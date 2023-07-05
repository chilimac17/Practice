#include <stdio.h>
#include <string.h>

/**
 * @brief 
 * strcpy()	strcpy(destStr, sourceStr)
 * - Copies sourceStr (up to and including null character) to destStr.	
 * - strcpy(targetText, userText); // Copies "UNICEF" + null char 
                              // to targetText 
strcpy(targetText, orgName);  // Error: "United Nations" 
                              // has > 10 chars
targetText = orgName;         // Error: Strings can't be 
                              // copied this way
strncpy()	strncpy(destStr, sourceStr, numChars)

Copies up to numChars characters.	
strncpy(orgName, userText, 6); // orgName is "UNICEF Nations"
strcat()	strcat(destStr, sourceStr)

Copies sourceStr (up to and including null character) to end of destStr (starting at destStr's null character).	
strcat(orgName, userText); // orgName is "United NationsUNICEF"
strncat()	strncat(destStr, sourceStr, numChars)

Copies up to numChars characters to destStr's end, then appends null character.	
strcpy(targetText, "abc");           // targetText is "abc"
strncat(targetText, "123456789", 3); // targetText is "abc123"


strchr()	strchr(sourceStr, searchChar)

Returns NULL if searchChar does not exist in sourceStr. (Else, returns address of first occurrence, discussed elsewhere).
NULL is defined in the string.h library.	
if (strchr(orgName, 'U') != NULL) { // 'U' exists in orgName?
   ...  // 'U' exists in "United Nations", branch taken
}  
if (strchr(orgName, 'u') != NULL) { // 'u' exists in orgName?
   ...  // 'u' doesn't exist (case matters), branch not taken
}
strlen()	size_t strlen(sourceStr)

Returns number of characters in sourceStr up to, but not including, first null character. size_t is integer type.	
x = strlen(orgName);    // Assigns 14 to x 
x = strlen(userText);   // Assigns 6 to x
x = strlen(targetText); // Error: targetText may lack null char
strcmp()	int strcmp(str1, str2)

Returns 0 if str1 and str2 are equal, non-zero if they differ.	
if (strcmp(orgName, "United Nations") == 0) {
   ... // Equal, branch taken
}
if (strcmp(orgName, userText) != 0) {
   ... // Not equal, branch taken
}


 * @return int 
 */

int main(void) {
   char userName[15] = "Alan Turing";
   int i;
   
   printf("Before: %s\n", userName);
   
   for (i = 0; i < strlen(userName); ++i) {
      if (userName[i] == ' ') {
         userName[i] = '_';
      }
   }
   printf("After:  %s\n", userName);

      char nameArr[10];       // User specified name
   char greetingArr[17];   // Output greeting and name
   
   // Prompt user to enter a name
   printf("Enter name: ");
   fgets(nameArr, 10, stdin);
   
   // Eliminate end-of-line char
   if (nameArr[strlen(nameArr) - 1] == '\n') {
      nameArr[strlen(nameArr)-1] = '\0';
   }

   
   // Modify string, hello + user specified name
   strcpy(greetingArr, "Hello ");
   strcat(greetingArr, nameArr);
   strcat(greetingArr, ".");
   
   // Output greeting and name
   printf("%s\n", greetingArr);
   
   return 0;
}