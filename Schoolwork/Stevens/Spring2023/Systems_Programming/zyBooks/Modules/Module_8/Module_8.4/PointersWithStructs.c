#include <stdio.h>
#include <stdlib.h>

/**
 * @brief 
 * structPtr->memberName     // Equivalent to (*structPtr).memberName
 */

typedef struct myItem_struct {
   int num1;
   int num2;
} myItem;

typedef struct bagContents_struct {
   int numApples;
   int numOranges;
} bagContents;

void myItem_PrintNums(myItem* itemPtr) {
   if (itemPtr == NULL) return;
   
   printf("num1: %d\n", itemPtr->num1);
   printf("num2: %d\n", itemPtr->num2);
}

void bagContents_PrintBag(bagContents* itemPtr) {
   if (itemPtr == NULL) return;

   printf("Apples: %d\n", itemPtr->numApples);
   printf("Oranges: %d\n", itemPtr->numOranges);
}

int main(void) {
   myItem* myItemPtr1 = NULL;
   
   myItemPtr1 = (myItem*)malloc(sizeof(myItem));
   
   myItemPtr1->num1 = 5;
   (*myItemPtr1).num2 = 10;
   
   myItem_PrintNums(myItemPtr1);

    bagContents* groceryPtr = NULL;

   groceryPtr = (bagContents*)malloc(sizeof(bagContents));

   /* Your solution goes here  */
   groceryPtr->numApples = 10;
   groceryPtr->numOranges = 3;

   bagContents_PrintBag(groceryPtr);
   
   return 0;
}