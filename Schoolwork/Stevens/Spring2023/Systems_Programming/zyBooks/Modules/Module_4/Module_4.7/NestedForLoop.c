#include <stdio.h>

/* Output all two-letter .com Internet domain names */

int main(void) {
   char letter1;
   char letter2;
   
   printf("Two-letter domain names:\n");
   
   letter1 = 'a';
   while (letter1 <= 'z') {
      letter2 = 'a';
      while (letter2 <= 'z') {
         printf("%c%c.com\n", letter1, letter2);
         ++letter2;
      }
      ++letter1;
   }
   
   int numAsterisk;  // Number of asterisks to print
   int i;            // Loop counter
   
   numAsterisk = 0;

   while (numAsterisk >= 0) {
      printf("Enter an integer (negative to quit): ");
      scanf("%d", &numAsterisk);
      
      if (numAsterisk >= 0) {
         printf("Depicted graphically:\n");
         for (i = 1; i <= numAsterisk; ++i) {
            printf("*");
         }
         printf("\n\n");
      }
   }
   
   printf("Goodbye.\n");

      int userNum;
   int i;
   int j;

   scanf("%d", &userNum);

   /* Your solution goes here  */
   for(i = 0; i <= userNum; i++){
      
      for(j = 0; j < i; j++){
        
         printf(" ");
         
      }
        printf("%d\n",i);
   }


   int numRows;
   int numColumns;
   int currentRow;
   int currentColumn;
   char currentColumnLetter;

   scanf("%d", &numRows);
   scanf("%d", &numColumns);

   /* Your solution goes here  */
   currentColumnLetter = 'A';
   for(currentRow =1; currentRow <= numRows; currentRow++ ){
      for(currentColumn = 0; currentColumn < numColumns; currentColumn++){
         printf("%d%c ", currentRow, currentColumnLetter);
         currentColumnLetter += 1;
      }
      currentColumnLetter = 'A';
   }

   printf("\n");
   return 0;
}
