
#include <stdio.h>

int main(void) {
   char userWord[6];

   printf("Enter a 5-letter word: ");
   scanf("%s", userWord);

   printf("Scrambled: ");
   printf("%c", userWord[3]);
   printf("%c", userWord[1]);
   printf("%c", userWord[4]);
   printf("%c", userWord[0]);
   printf("%c", userWord[2]);
   printf("\n");


  char userWord1[21] = "Caterpillar";   
  int replaceIndex;

  printf("Enter an index (0-10): ");
  scanf("%d", &replaceIndex);

  userWord1[replaceIndex] = '*';

  printf("Updated string: ");
  printf("%s\n", userWord1);


     char userCaption[22]; // 20 user char, +1 for period, +1 for null char
   int lastIndex;
   char lastChar;

   printf("Enter a caption (20 char max): ");
   scanf("%s", userCaption);

   lastIndex = strlen(userCaption) - 1;
   lastChar  = userCaption[lastIndex];

   if ( (lastChar != '.') && (lastChar != '!') && (lastChar != '?') ) {
      // User's caption lacked ending punctuation, so add a period
      strcat(userCaption, ".");
   }

   printf("New: %s\n", userCaption);

   char userInput[50];
   int stringSize;

   scanf("%s", userInput);

   /* Your solution goes here  */
   stringSize = strlen(userInput);

   printf("Size of userInput: %d\n", stringSize);

    char userInput1[50];
   char firstLetter;

   scanf("%s", userInput1);
   scanf(" %c", &firstLetter);

   if (userInput1[0] == firstLetter) {
      printf("Found match: %c\n", firstLetter);
   }
   else {
      printf("No match: %c\n", firstLetter);
   }

   return 0;
}