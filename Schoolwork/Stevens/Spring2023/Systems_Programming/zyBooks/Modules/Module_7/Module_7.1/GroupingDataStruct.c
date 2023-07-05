#include <stdio.h>

/**
 * @brief 
 * The struct construct defines a new type, 
 * which can be used to declare a variable with subitems
 * 
 * typedef struct StructTypeName_struct {
 *  type item1;
 *  type item2;
 *  ...
 *  type itemN;      
 * } StructTypeName;
 * 
 * ...
 * StructTypeName myVar;
 * myVar.item1 = ...
 * 
 * The above uses a common combination of a typedef definition with a struct definition. 
 * A typedef defines a new type name for an existing type. 
 * This material uses that combination exclusively and does not discuss typedef definition separately.
 * The struct StructTypeName_struct { ... } part defines a new struct type named struct StructTypeName_struct. 
 * The typedef part defines a new type name named StructTypeName that is synonymous with struct StructTypeName_struct.
 * A programmer can use StructTypeName to declare a variable of that struct type as in the statement StructTypeName myVar;.
 * Each type may be any type like int or char. Each struct subitem is called a data member. For a declared variable, each struct data member can be accessed using ".", known as a member access operator, sometimes called dot notation.
 * Assigning a variable of a struct type to another such variable automatically assigns each corresponding data member, as shown below.
 */

/* Your solution goes here  */

typedef struct InventoryTag_struct {
   int itemID;
   int quantityRemaining;
} InventoryTag;

typedef struct PatientData_struct {
      int heightInches;
      int weightPounds;
   }PatientData;

int main(void) {
   PatientData lunaLovegood;

   scanf("%d", &lunaLovegood.heightInches);
   scanf("%d", &lunaLovegood.weightPounds);

   printf("Patient data: %d in, %d lbs\n", lunaLovegood.heightInches, lunaLovegood.weightPounds);

      InventoryTag redSweater;

   scanf("%d", &redSweater.itemID);
   scanf("%d", &redSweater.quantityRemaining);

   /* Your solution goes here  */
   printf("Inventory ID: %d, Qty: %d\n",redSweater.itemID,redSweater.quantityRemaining  );

   return 0;
}