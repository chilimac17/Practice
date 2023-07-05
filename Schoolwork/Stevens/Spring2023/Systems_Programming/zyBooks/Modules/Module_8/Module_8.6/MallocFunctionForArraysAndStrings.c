
#include <stdio.h>
#include <stdlib.h>
/**
 * @brief 
 * 
 * pointerVariableName = (dataType*)malloc(numElements * sizeof(dataType))
 */
int main(void) {
   int* userVals = NULL; // No array yet
   int numVals;
   int i;
   
   printf("Enter number of integer values: ");
   scanf("%d", &numVals);
   
   userVals = (int*)malloc(numVals * sizeof(int));
   
   printf("Enter %d integer values...\n", numVals);
   for (i = 0; i < numVals; ++i) {
      printf("Value: ");
      scanf("%d", &(userVals[i]));
   }
   
   printf("You entered: ");
   for (i = 0; i < numVals; ++i) {
      printf("%d ", userVals[i]);
   }
   printf("\n");
   
   free(userVals);


   char nameArr[100];        // User specified name
   char* greetingPtr = NULL; // Pointer to output greeting and name
   
   // Prompt user to enter a name
   printf("Enter name: ");
   fgets(nameArr, 100, stdin);
   
   // Eliminate end-of-line char
   nameArr[strlen(nameArr) - 1] = '\0';
   
   // Dynamically allocate greeting
   greetingPtr = (char*)malloc((strlen(nameArr) + 8) * sizeof(char));
   
   // Modify string, hello + user specified name
   strcpy(greetingPtr, "Hello ");
   strcat(greetingPtr, nameArr);
   strcat(greetingPtr, ".");
   
   // Output greeting and name
   printf("%s\n", greetingPtr);
   
   free(greetingPtr);


   char userStr[100];
   char* newStr = NULL;

   fgets(userStr, 100, stdin);

   /* Your solution goes here  */
   newStr = (char*)malloc((strlen(userStr) + 1) * sizeof(char));

   strcpy(newStr, userStr);
   printf("%s\n", newStr);
   
   return 0;
}