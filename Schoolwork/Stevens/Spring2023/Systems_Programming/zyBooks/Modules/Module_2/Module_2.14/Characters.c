#include <stdio.h>

int main(void) {
   char arrowBody;
   char arrowHead;

   arrowBody = '-';
   arrowHead = '>';

   printf("%c%c%c%c\n", arrowBody, arrowBody, arrowBody, arrowHead);

   arrowBody = 'o';

   printf("%c%c%c%c\n", arrowBody, arrowBody, arrowBody, arrowHead);

   char bodyChar;
   char headChar;

   printf("Type two characters: ");
   scanf(" %c", &bodyChar);
   scanf(" %c", &headChar);

   // Output arrow body then head
   printf("%c%c%c", bodyChar, bodyChar, bodyChar);
   printf("%c\n", headChar);

   char userChar;

   scanf("%c", &userChar);

   printf("%c %c\n", userChar, userChar);
   printf(" %c\n", userChar);
   printf("%c%c%c\n", userChar, userChar, userChar);

   char letterToQuit;
   int  numPresses;

   scanf(" %c ", &letterToQuit);
   scanf("%d", &numPresses);

   /* Your solution goes here  */
   printf("Press the %c key %d times to quit.\n", letterToQuit, numPresses);

   char a;
   char b;
   char c;

   scanf(" %c ", &a);
   scanf(" %c ", &b);
   scanf(" %c ", &c);

   /* Your solution goes here  */


   //Next Assignment
   /* Your solution goes here  
   
   Declare a character variable letterStart. Write a statement to read a letter from 
   the user into letterStart, followed by statements that output that letter and the 
   next letter in the alphabet. End with a newline. Hint: A letter is stored as its 
   ASCII number, so adding 1 yields the next letter. Sample output assuming the user 
   enters 'd': de
   
   */

   return 0;
}