#include <stdio.h>
#include <string.h>

int main(void) {
   char objectInfo[100] = "Shoes 18 17";
   char object[50];
   int quantity;
   int price;

   sscanf(objectInfo, "%s %d %d", object, &price, &quantity);

   printf("%s x%d\n", object, quantity);
   printf("Price: %d", price);

   char object1Info[100] = "Eraser 7 6";
   char object2Info[100] = "Mug 15 14";
   char object3Info[100] = "Book 25 26";

   char object1[50];
   int quantity1;
   int price1;

   sscanf(object3Info, "%s %d %d", object1, &quantity1, &price1);

   printf("%s x%d\n", object1, quantity1);
   printf("Price: %d", price1);

   return 0;
}