#include <stdio.h>

/* Estimates dog's age in equivalent human years.
   Source: www.dogyears.com 
*/

int main(void) {
   int dogAgeYears;

   printf("Enter your dog's age (in years): ");
   scanf("%d", &dogAgeYears);

   switch (dogAgeYears) {
      case 0:
         printf("That's 0..14 human years.\n");
         break;

      case 1:
         printf("That's 15 human years.\n");
         break;

      case 2:
         printf("That's 24 human years.\n");
         break;

      case 3:
         printf("That's 28 human years.\n");
         break;

      case 4:
         printf("That's 32 human years.\n");
         break;

      case 5:
         printf("That's 37 human years.\n");
         break;

      default:
         printf("Human years unknown.\n");
         break;
   }

   int dogAgeMonths;

   printf("Enter your dog's age (in years): ");
   scanf("%d", &dogAgeYears);

   if (dogAgeYears == 0) {
      printf("Enter your dog's age in months: ");
      scanf("%d", &dogAgeMonths);

      switch (dogAgeMonths) {
         case 0:
         case 1:
         case 2:
            printf("That's 0..14 human months.\n");
            break;

         case 3:
         case 4:
         case 5:
         case 6:
            printf("That's 1..5 human years.\n");
            break;

         case 7:
         case 8:
            printf("That's 5..9 human years.\n");
            break;

         case 9:
         case 10:
         case 11:
         case 12:
            printf("That's 9..15 human years.\n");
            break;

         default:
            printf("Invalid input.\n");
            break;
      }
   }
   else {
      printf("FIXME: Do earlier dog year cases.\n");
      switch (dogAgeYears) {
      }
   }


   int nextChoice;

   scanf("%d", &nextChoice);

   /* Your solution goes here  */
   switch (nextChoice) {
   case 0:
      printf("Rock\n");
      break;
   case 1:
      printf("Paper\n");
      break;
   case 2:
      printf("Scissors\n");
      break;
   default:
      printf("Unknown\n");
      break;
 }

   char origLetter;

   scanf(" %c", &origLetter);

   /* Your solution goes here  */
   switch (origLetter) {
   case 'A':
      printf("Alpha\n");
      break;
   case 'a':
      printf("Alpha\n");
      break;

   case 'B':
      printf("Beta\n");
      break;
   case 'b':
      printf("Beta\n");
      break;
   default:
      printf("Unknown\n");
      break;
}
   return 0;
}
