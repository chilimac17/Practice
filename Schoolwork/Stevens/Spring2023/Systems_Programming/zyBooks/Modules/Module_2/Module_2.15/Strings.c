#include <stdio.h>
#include <string.h>

int main(void) {
   char sentenceSubject[20];
   char sentenceVerb[20];
   char sentenceObject[20] = "an apple";

   strcpy(sentenceSubject, "boy");
   strcpy(sentenceVerb, "ate");

   printf("A ");
   printf("%s ", sentenceSubject);
   printf("%s ", sentenceVerb);
   printf("%s.\n", sentenceObject);

   char wordRelative[50];
   char wordFood[50];
   char wordAdjective[50];
   char wordTimePeriod[50];

   // Get user's words
   printf("Type input (< 50 char) w/o spaces.\n");

   printf("Enter a kind of relative:\n");
   scanf("%s", wordRelative);

   printf("Enter a kind of food:\n");
   scanf("%s", wordFood);

   printf("Enter an adjective:\n");
   scanf("%s", wordAdjective);

   printf("Enter a time period:\n");
   scanf("%s", wordTimePeriod);

   // Tell the story
   printf("\n");
   printf("My %s", wordRelative);
   printf(" says eating %s \n", wordFood);
   printf("will make me more %s, \n", wordAdjective);
   printf("so now I eat it every %s.\n", wordTimePeriod);

   char firstName[50];
   char lastName[50];

   printf("Enter first name:\n");
   scanf("%s", firstName);  // Gets up to first space or ENTER

   printf("Enter last name:\n");
   scanf("%s", lastName);  // Gets up to first space or ENTER

   printf("\n");
   printf("Welcome %s %s!\n", firstName, lastName);
   printf("May I call you %s?\n", firstName);

   return 0;
}