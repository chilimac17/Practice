#include <stdio.h>

/**
 * @brief 
 * The struct construct's power is evident when used with functions. 
 * A struct can be used to return multiple values. 
 * Although ConvHrMin() has two output values, the struct type allows the function to return a single item, avoiding a less-clear approach using two pass by reference parameters.
 */

typedef struct ProductInfo_struct {
   char itemName[50];
   int itemQty;
} ProductInfo;

ProductInfo AddToStock(ProductInfo productToStock, int increaseValue) {
   productToStock.itemQty = productToStock.itemQty + increaseValue;

   return productToStock;
}

typedef struct HeightFtIn_struct {
   int feetVal;
   int inchesVal;
} HeightFtIn;

HeightFtIn ConvertToFeetAndInches(int totalInches) {
   HeightFtIn tempVal;

   /* Your code goes here */
   tempVal.feetVal = totalInches / 12; 
   tempVal.inchesVal = totalInches % 12;
   
   return tempVal;

}

typedef struct ElapsedTime_struct {
   int numHours;
   int numMinutes;
} ElapsedTime;

/* Your code goes here */
ElapsedTime SetTime(int hoursVal,int minutesVal)
{
   ElapsedTime ep;
   ep.numHours = hoursVal;
   ep.numMinutes = minutesVal;
   return ep;
}

int main(void) {
   ProductInfo computerInfo;
   int addStock;

   scanf("%s", computerInfo.itemName);
   scanf("%d", &computerInfo.itemQty);
   scanf("%d", &addStock);

   /* Your code goes here */
  computerInfo = AddToStock(computerInfo,addStock);

   printf("Name: %s, stock: %d\n", computerInfo.itemName, computerInfo.itemQty);

   HeightFtIn objectSize;
   int totalInches;

   scanf("%d", &totalInches);

   objectSize = ConvertToFeetAndInches(totalInches);

   printf("%d feet and %d inches\n", objectSize.feetVal, objectSize.inchesVal);

   ElapsedTime lateBy;
   int hoursVal;
   int minutesVal;

   scanf("%d", &hoursVal);
   scanf("%d", &minutesVal);

   lateBy = SetTime(hoursVal, minutesVal);

   printf("We met %d:%d hours ago.\n", lateBy.numHours, lateBy.numMinutes);

   return 0;
}