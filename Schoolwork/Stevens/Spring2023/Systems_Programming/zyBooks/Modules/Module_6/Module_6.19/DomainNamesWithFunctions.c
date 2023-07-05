#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdbool.h>
#include <stdlib.h>
 
// Global variables used for array lengths
const int MAX_NUMS = 4;
const int MAX_SIZE = 6;

// ***********************************************************************
 
// Returns the position of a single period in a string  
int GetPeriodPosition(char stringToSearch[]) {
   int stringLength;
   int periodCounter;
   int periodPosition;
   int i;

   periodCounter = 0;
   periodPosition = -1;
   
   stringLength = strlen(stringToSearch);
 
   for (i = 0; i < stringLength; ++i) {
     if (stringToSearch[i] == '.') {
        ++periodCounter;
        periodPosition = i;
     }
   }
 
   // If there are zero or two or more periods, indicate an incorrect domain name
   // by setting variable periodPosition to -1
   if (periodCounter != 1) {
      periodPosition = -1;
   }
   return periodPosition;
}
 
// ***********************************************************************
 
// Checks if the second level domain part is valid 
 
bool HasValidSecondLevel(char secondLevel[]) {
   const int MAX_SECONDLEVEL_LENGTH = 63;
   const char DASH = '-';
 
   bool isValidSecondLevel;      // Assume valid second-level domain
   int secondLevelLength;
   char nextChar;
   isValidSecondLevel = true;
   nextChar           = '?';
   int i;
   
   secondLevelLength = strlen(secondLevel);
 
   // Disqualify the second-level domain if it is too short or too long, or
   // if it begins or ends with a dash
   if ((secondLevelLength >= 1) &&
       (secondLevelLength <= MAX_SECONDLEVEL_LENGTH)) {
      if ((secondLevel[0] == DASH) ||
          (secondLevel[secondLevelLength - 1] == DASH)) {
         isValidSecondLevel = false;
      }
   }
   else {
      isValidSecondLevel = false;
   }
 
   // Disqualify the second-level domain if any character is not a letter,
   // digit, or a dash
   i = 0;
   while ((i < secondLevelLength) && (isValidSecondLevel)) {
      nextChar = secondLevel[i];
      if ((!isalnum(nextChar)) && (nextChar != DASH)) {
         isValidSecondLevel = false;
      }
      ++i;
   }
 
   return isValidSecondLevel;
}

// ***********************************************************************
 
// Checks if the top-level domain part is valid  
  
bool HasValidTld(char theTld[]) {
   bool isValidTopLevel;     // Assume valid top-level domain
   int topLevelLength;
   char nextChar;
   int i;
   
   isValidTopLevel = true;
   nextChar        = '?';

   topLevelLength = strlen(theTld);
 
   // Disqualify the top-level domain if it is the empty string or
   // the first character is not a period
 
   if ((topLevelLength <= 0) || (theTld[0] != '.')) {
      isValidTopLevel = false;
   }
 
   // Disqualify the top-level domain if any character is not a letter or a digit
   i = 1;
   while ((i < topLevelLength) && (isValidTopLevel)) {
      nextChar = theTld[i];
      if (!isalnum(nextChar)) {
         isValidTopLevel = false;
      }
      ++i;
   }
 
   return isValidTopLevel;
}
 
// ***********************************************************************
 
// Checks if the TLD part is a special gTLD 
 
bool IsSpecialGtld(char specialGtld[MAX_NUMS][MAX_SIZE], char tld[]) {
   bool isSpecial;
   int i;

   isSpecial = false;
 
   i = 0;
   while ((i < MAX_NUMS) && (!isSpecial)) {
      if (strcmp(specialGtld[i], tld) == 0) {
         isSpecial = true;
      }
      else {
         ++i;
      }
   }
   return isSpecial;
}
 
// ***********************************************************************
 
// Prompts user for input and updates the userInput parameter
void GetString(const char prompt[], char userInput[50]) {   
   strcpy(userInput, "");
   printf("%s\n", prompt);
   scanf("%s", userInput);
}

// ***********************************************************************
 
int main(void) {
   const char PROMPT_DOMAIN_NAME[50] = "\nEnter the next domain name (Enter to exit): ";
  
   // Define the list of valid core gTLDs and restricted gTLDs
   char validCoreGtld[MAX_NUMS][MAX_SIZE];
   char validRestrictedGtld[MAX_NUMS][MAX_SIZE];
   char inputName[50];
   char searchName[50];
   char secondLevel[50];       // In aaa.bbb, the aaa part, aka second-level domain
   char theTld[50];            // In aaa.bbb, the bbb part, aka top-level domain
   int periodPosition;
   bool isCoreGtld;
   bool isPeriodPositionValid;
   bool isRestrictedGtld;
   bool isDomainValid;
   int i;
   
   isCoreGtld      = false;
   isPeriodPositionValid = false;
   isRestrictedGtld      = false;
   isDomainValid         = false;
   
   i = 0;
   strcpy(validCoreGtld[i], ".com");         ++i;
   strcpy(validCoreGtld[i], ".net");         ++i;
   strcpy(validCoreGtld[i], ".org");         ++i;
   strcpy(validCoreGtld[i], ".info");        ++i;

   i = 0;
   strcpy(validRestrictedGtld[i], ".biz");   ++i;
   strcpy(validRestrictedGtld[i], ".name");  ++i;
   strcpy(validRestrictedGtld[i], ".pro");   ++i;


   // Get the first domain name to process
   GetString(PROMPT_DOMAIN_NAME, inputName);

   while (strlen(inputName) > 0) {
      // clear the string arrays of chars
      for (i = 0; i < 50; ++i) {
         searchName[i] = '\0';
         theTld[i] = '\0';
      }
      strcpy(theTld, "");

      for (i = 0; i < strlen(inputName); ++i) {
         searchName[i] = tolower(inputName[i]);
      }
      isCoreGtld     = false;
      isDomainValid  = false;
      periodPosition = GetPeriodPosition(searchName);
      isPeriodPositionValid = (periodPosition >= 1);

      // The domain name is valid if there is exactly one period in the
      // domain name (at location periodPosition) and the domain name does
      // not start or end with a period. Note that a period position of 0 means
      // the first character is a period, rendering the domain name invalid
      if ((periodPosition > 0) && (searchName[strlen(searchName) - 1] != '.')) {
         isPeriodPositionValid = true;
      }
      else {
         isPeriodPositionValid = false;
      }
      if (isPeriodPositionValid) {

         // Extract the second-level domain and the top-level domain
         for (i = 0; i < periodPosition; ++i) {
            secondLevel[i] = searchName[i];
         }
         for (i = periodPosition; i < strlen(searchName); ++i) {
            theTld[i - periodPosition] = searchName[i];
         }
         isDomainValid = HasValidSecondLevel(secondLevel) && HasValidTld(theTld);

         // If the domain name is valid see if there is a core gTLD or a restricted gTLD
         if (isDomainValid) {
            isCoreGtld = IsSpecialGtld(validCoreGtld, theTld);
            if (!isCoreGtld) {
               isRestrictedGtld = IsSpecialGtld(validRestrictedGtld, theTld);
            }
         }
      }

      // Display the results
      printf("\"%s\" ", inputName);
      if (isDomainValid) {
         printf("is a valid domain name and ");
         if (isCoreGtld) {
            printf("has a core gTLD of \"%s\".\n", theTld);
         }
         else if (isRestrictedGtld) {
            printf("has a restricted gTLD of \"%s\".\n", theTld);
         }
         else {
            printf("has a TLD of \"%s\".\n", theTld);
         }
      }
      else {
         printf("is not a valid domain name.\n");
      }

      GetString(PROMPT_DOMAIN_NAME, inputName);
   }

   return 0;
}
