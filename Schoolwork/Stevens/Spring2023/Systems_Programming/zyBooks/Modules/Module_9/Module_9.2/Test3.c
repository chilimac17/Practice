#include <stdio.h>

int main(void) {

   char myString[30] = "Testing";

   
   printf("%-8s123\n", myString);  

   int myInt;

   myInt = 674;

   printf("%1d\n", myInt);
   printf("%5d\n", myInt);


   float myFloat1;
   float myFloat2;

   myFloat1 = 93.9214;
   myFloat2 = 85.6343;

   printf("%.3f\n", myFloat1);
   printf("%.6f\n", myFloat2);

   float myFloat;

   myFloat = 64.7224;

   printf("%e\n", myFloat);

   int myInt5;
   float myFloat5;

   myInt5 = 903;
   myFloat5 = 85.62;

  printf("%04d\n", myInt5);
  printf("%07.2f\n", myFloat5);

   char myString5[10] = "Lucy";

   printf("%2s\n", myString5);
   printf("%7s\n", myString5);

   char name1[10] = "Layla";
   char name2[10] = "Ann";

   printf("%-7s*\n", name1);
   printf("%-7s*\n", name2);

   return 0;
}
