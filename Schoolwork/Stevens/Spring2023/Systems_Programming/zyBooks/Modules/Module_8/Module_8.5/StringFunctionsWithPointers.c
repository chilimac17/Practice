
#include <stdio.h>
#include <string.h>

int main(void) {
   const int MAX_USER_INPUT = 100;  // Max input size
   char userInput[MAX_USER_INPUT];  // User defined string
   char* stringPos = NULL;          // Index into string
   
   // Prompt user for input
   printf("Enter a line of text: ");
   fgets(userInput, MAX_USER_INPUT, stdin);
   
   // Locate exclamation point, replace with period
   stringPos = strchr(userInput, '!');
   
   if (stringPos != NULL) {
      *stringPos = '.';
   }
   
   // Locate "Boo" replace with "---"
   stringPos = strstr(userInput, "Boo");
   
   if (stringPos != NULL) {
      strncpy(stringPos, "---", 3);
   }
   
   // Output modified string
   printf("Censored: %s\n", userInput);

   char personName[100];
   char searchChar;
   char* searchResult = NULL;

   fgets(personName, 100, stdin);
   scanf("%c", &searchChar);

   /* Your solution goes here  */
   searchResult = strchr(personName,searchChar);

   if (searchResult != NULL) {
      printf("Character found.\n");
   }
   else {
      printf("Character not found.\n");
   }

   char movieTitle[100];
   char* movieResult = NULL;

   fgets(movieTitle, 100, stdin);

   /* Your solution goes here  */
   movieResult = strstr(movieTitle,"The");

   printf("Movie title contains The? ");
   if (movieResult != NULL) {
      printf("Yes.\n");
   }
   else {
      printf("No.\n");
   }

   
   return 0;
}