#include <stdio.h>

int main(void) {
   FILE* inFile = NULL; // File pointer
   int fileNum;         // Data value from file
   int numRead;
   
   // Open file
   printf("Opening file myfile3.txt.\n");
   inFile = fopen("myfile3.txt", "r");
   
   if (inFile == NULL) {
      printf("Could not open file myfile.txt.\n");
      return -1; // -1 indicates error
   }
   
   // Print read numbers to output
   printf("Reading and printing numbers.\n");   

   numRead = fscanf(inFile, "%d", &fileNum);
    
   while (!feof(inFile)) {
      if ( numRead == 1 ) {
         printf("num: %d\n", fileNum);
      }
      else {
         printf("Input failure before reaching end of file.\n");
         break;
      }
      numRead = fscanf(inFile, "%d", &fileNum);
   }
   
   printf("Closing file myfile.txt.\n");
   
   // Done with file, so close it
   fclose(inFile);
   
   return 0;
}