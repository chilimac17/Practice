
#include <stdio.h>

int main(void) {
   int kidsInFamily1;       // Should be int, not double
   int kidsInFamily2;       // (know anyone with 2.3 kids?)
   int numFamilies; 

   double avgKidsPerFamily; // Expect fraction, so double

   kidsInFamily1 = 3;
   kidsInFamily2 = 4;
   numFamilies = 2; 

   avgKidsPerFamily = (double)(kidsInFamily1 + kidsInFamily2) 
                      / (double)numFamilies;

   printf("Average kids per family: %lf\n", avgKidsPerFamily);

   int kidsInFamily1;       // Should be int, not double
   int kidsInFamily2;       // (know anyone with 2.3 kids?)
   int numFamilies; 

   double avgKidsPerFamily; // Expect fraction, so double

   kidsInFamily1 = 3;
   kidsInFamily2 = 4;
   numFamilies = 2; 

   avgKidsPerFamily = (kidsInFamily1 + kidsInFamily2) / numFamilies;

   // Should be 3.5, but is 3 instead
   printf("Average kids per family: %lf\n", avgKidsPerFamily);

   int numKidsA;
   int numKidsB;
   int numKidsC;
   int numFamilies;
   double avgKids;

   scanf("%d", &numKidsA);
   scanf("%d", &numKidsB);
   scanf("%d", &numKidsC);
   scanf("%d", &numFamilies);

   /* Your solution goes here  */

   printf("%lf\n", avgKids);

   return 0;
}