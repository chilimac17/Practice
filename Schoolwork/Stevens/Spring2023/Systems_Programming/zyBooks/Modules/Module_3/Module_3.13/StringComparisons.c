#include <stdio.h>
#include <string.h>

int main() {
   char userWord[50];
   
   printf("Enter a word: ");
   scanf("%s", userWord);
   
   if (strcmp(userWord, "USA") == 0) {
      printf("United States of America\n");
   }
   else {
      printf("%s\n", userWord);
   }
   
    char userString[50];

   scanf("%s", userString);

   /* Your solution goes here  */
   if(strcmp(userString, "Quit") == 0 ){
      printf("Goodbye\n");
   }else{
      printf("Hello\n");  
   }

      char firstString[50];
   char secondString[50];

   scanf("%s", firstString);
   scanf("%s", secondString);

   /* Your solution goes here  */
   if(strcmp(firstString,secondString ) < 0 ){
      printf("%s ",firstString);
      printf("%s\n",secondString);
   }else{
      printf("%s ",secondString);
      printf("%s\n",firstString);  
   }
   
   return 0;
}