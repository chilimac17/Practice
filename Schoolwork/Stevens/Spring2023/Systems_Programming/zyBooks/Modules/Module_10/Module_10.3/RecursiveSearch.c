#include <stdio.h>
#include <string.h>

/* Finds index of string in array of strings, else -1.
   Searches only with index range low to high
   Note: Upper/lower case characters matter
*/

const int NUM_ATTENDEES = 6;        // Number of total attendees
const int CHAR_LIMIT_PER_NAME = 50; // Limit size of attendee name

int FindMatch(char stringsList[NUM_ATTENDEES][CHAR_LIMIT_PER_NAME], char itemMatch[],
              int lowVal, int highVal) {
   int midVal;        // Midpoint of low and high values
   int itemPos;       // Position where item found
   int rangeSize;     // Remaining range of values to search for match
   
   itemPos = -1;      // -1 if not found
   rangeSize = (highVal - lowVal) + 1;
   midVal = (highVal + lowVal) / 2;
   
   if (strcmp(stringsList[midVal], itemMatch) == 0) {   // Base case 1: item found at midVal position
      itemPos = midVal;
   }
   else if (rangeSize == 1) {                           // Base case 2: match not found
      itemPos = -1;
   }
   else {                                               // Recursive case: search lower or upper half
      if (strcmp(itemMatch, stringsList[midVal]) < 0) { // Search lower half, recursive call
         itemPos = FindMatch(stringsList, itemMatch, lowVal, midVal);
      }
      else {                                            // Search upper half, recursive call
         itemPos = FindMatch(stringsList, itemMatch, midVal + 1, highVal);
      }
   }
   
   return itemPos;
}

void GuessNumber(int lowVal, int highVal) {
   int midVal;            // Midpoint of low and high value
   char userAnswer;       // User response
   
   midVal = (highVal + lowVal) / 2;
   
   // Prompt user for input
   printf("Is it %d? (l/h/y): ",midVal);
   scanf(" %c", &userAnswer);
   
   if( (userAnswer != 'l') && (userAnswer != 'h') ) { // Base case: Found number
      printf("Thank you!\n");                         
   }
   else {                                             // Recursive case: split into lower OR upper half
      if (userAnswer == 'l') {                        // Guess in lower half
         GuessNumber(lowVal, midVal);                 // Recursive call
      }
      else {                                          // Guess in upper half
         GuessNumber(midVal + 1, highVal);            // Recursive call
      }
   }
}
int main(void) {
   char attendeesList[NUM_ATTENDEES][CHAR_LIMIT_PER_NAME]; // List of attendees
   char attendeeName[50];                                  // Name of attendee to match. 50 is CHAR_LIMIT_PER_NAME
   int matchPos;                                           // Matched position in attendee list
   
   // Omitting part of program that adds attendees
   // Instead, we insert some sample attendees in sorted order
   strcpy(attendeesList[0],"Adams, Mary");
   strcpy(attendeesList[1],"Carver, Michael");
   strcpy(attendeesList[2],"Domer, Hugo");
   strcpy(attendeesList[3],"Fredericks, Carlos");
   strcpy(attendeesList[4],"Li, Jie");
   strcpy(attendeesList[5],"Zuckerberg, Al");
   
   // Prompt user to enter a name to find
   printf("Enter person's name: Last, First: ");
   fgets(attendeeName, CHAR_LIMIT_PER_NAME, stdin);
   attendeeName[strlen(attendeeName) - 1] = '\0'; // remove newline
   
   // Call function to match name, output results
   matchPos = FindMatch(attendeesList, attendeeName, 0, NUM_ATTENDEES - 1);
   if (matchPos >= 0) {
      printf("Found at position %d.\n",matchPos);
   }
   else {
      printf("Not found. \n");
   }
   

   // Print game objective, user input commands
   printf("Choose a number from 0 to 100.\n");
   printf("Answer with:\n");
   printf("   l (your num is lower)\n");
   printf("   h (your num is higher)\n");
   printf("   any other key (guess is right).\n");

   // Call recursive function to guess number
   GuessNumber(0, 100);

   return 0;
}