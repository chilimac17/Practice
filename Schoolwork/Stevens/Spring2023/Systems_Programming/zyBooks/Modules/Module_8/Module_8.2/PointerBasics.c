#include <stdio.h>

int main(void) {
   int* numItemsPointer;
   int numItems;

   scanf("%d", &numItems);

   /* Your solution goes here  */
   if(numItems < 0)
   {
      numItemsPointer = NULL;
   }else{
      numItemsPointer = &numItems;
      *numItemsPointer *= 10;
   }

   if (numItemsPointer == NULL) {
      printf("Items is negative\n");
   }
   else {
      printf("Items: %d\n", *numItemsPointer);
   }

   return 0;
}