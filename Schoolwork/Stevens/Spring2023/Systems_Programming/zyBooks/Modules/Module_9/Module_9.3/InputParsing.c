#include <stdio.h>
#include <string.h>
#include <stdbool.h>

const double CM_PER_IN = 2.54;
const int    IN_PER_FT = 12;

/* Converts a height in feet/inches to centimeters */
double HeightFtInToCm(int heightFt, int heightIn) {
   int totIn;
   double cmVal;
   
   totIn = (heightFt * IN_PER_FT) + heightIn; // Total inches
   cmVal = totIn * CM_PER_IN;                 // Conv inch to cm
   return cmVal;
}

int main(void) {
   int userFt;  // User defined feet
   int userIn;  // User defined inches
   
   // Prompt user for feet/inches
   printf("Enter feet and inches separated by a space: ");
   scanf("%d %d", &userFt, &userIn);
   
   // Output converted feet/inches to cm result
   printf("Centimeters: %lf\n",
          HeightFtInToCm(userFt,userIn));

   int currHour;      // User defined hour
   int currMinute;    // User defined minutes
   char optAmPm[3];   // User defined am/pm

   // Prompt user for input
   printf("Enter the time using the format: HH:MM AM/PM: ");
   scanf("%2d:%2d %2s", &currHour, &currMinute, optAmPm);
   
   // Output time in 12 hrs
   printf("In 12 hours it will be: ");
   if (strcmp(optAmPm, "AM") == 0) {
      printf("%02d:%02d PM\n", currHour, currMinute);
   }
   else {
      printf("%02d:%02d AM\n", currHour, currMinute);
   }

   int currHour1;       // User defined hour
   int currMinute1;     // User defined minutes
   char optAmPm1[3];    // User defined am/pm
   
   // Prompt user for input
   printf("Enter the time using the format: HH:MM AM/PM: ");
   
   // Check number of items read
   if (scanf("%2d:%2d %2s", &currHour1, &currMinute1, optAmPm1) != 3 ) {
      printf("\nInvalid time format\n");
   }
   else {
      printf("In 12 hours it will be: ");
      if (strcmp(optAmPm1, "AM") == 0) {
         printf("%02d:%02d PM\n", currHour1, currMinute1);
      }
      else {
         printf("%02d:%02d AM\n", currHour1, currMinute1);
      }
   
    char myString[100] = "Amy Smith 19";  // Input string
   char firstName[50];                   // First name
   char lastName[50];                    // Last name
   int userAge;                          // Age
   
   // Parse input, break up into first/last name and age
   sscanf(myString, "%49s %49s %d", firstName, lastName, &userAge);
   
   // Output parsed values
   printf("First name: %s\n", firstName);
   printf("Last name: %s\n", lastName);
   printf("Age: %d\n", userAge);

      const int USER_TEXT_LIMIT = 1000;    // Limit input size
   char userText1[USER_TEXT_LIMIT];      // Holds input
   char firstName1[50];                  // First name
   char lastName1[50];                   // Last name
   int userAge1;                         // Age
   int valuesRead1;                      // Holds number of inputs read
   bool inputDone1;                      // Flag to indicate next iteration
   
   inputDone1 = false;

   // Prompt user for input
   printf("Enter \"firstname lastname age\" on each line\n");
   printf("(\"Exit\" as firstname exits).\n\n");
   
   // Grab data as long as "Exit" is not entered
   while (!inputDone1) {
      
      // Grab entire line, store in userText
      fgets(userText1, USER_TEXT_LIMIT, stdin);
      
      // Parse the line and check for correct number of entries.
      valuesRead1 = sscanf(userText1, "%49s %49s %d", firstName1, lastName1, &userAge1);
      if (valuesRead1 >= 1 && strcmp(firstName, "Exit") == 0) {
         printf("Exiting.\n");
         inputDone1 = true;
      }
      else if (valuesRead1 == 3) {
         printf("   First name: %s\n", firstName1);
         printf("   Last  name: %s\n", lastName1);
         printf("   Age: %d\n", userAge1);
         printf("\n");
      }
      else {
         printf("Invalid entry. Please try again.\n\n");
      }
   }
   return 0;
}