#include <stdio.h>
#include <string.h>
#include <ctype.h>

/* Define your function here. */
void CreateAcronym(char userPhrase[], char userAcronym[])
{
   //printf("%d\n",strlen(userPhrase) );
   int acronymIndex = 0;
   int wordCount = 0;
   for(int i =0; i < strlen(userPhrase); i++)
   {
      
      if(wordCount == 0){
         
         if(isupper(userPhrase[i]))
         {
            userAcronym[acronymIndex] = userPhrase[i];
            strcat(userAcronym,".");
            acronymIndex += 2;
         }
        wordCount++;
      }
      if(isspace(userPhrase[i]))
      {
         wordCount = 0;
      }else{
         wordCount++;   
      }
   }
    userAcronym[acronymIndex] = '\0';
    printf("%s\n",userAcronym);
}


int main() {

   /* Type your code here. */
   char userInput[50];
   char acronym[50] = "";
   
   fgets(userInput,50,stdin);
   //printf("%d\n",strlen(userInput) );
   CreateAcronym(userInput, acronym);

   return 0;
}
