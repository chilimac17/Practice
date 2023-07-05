#include <stdio.h>

int main(void) {
   int hourlyWage;

   hourlyWage = 20;

   printf("Annual salary is: ");
   printf("%d", hourlyWage * 40 * 50);
   printf("\n");

   printf("Monthly salary is: ");
   //printf("%d", ((hourlyWage * 40 * 50) / 1));
   // FIXME: The above is wrong. Change the 1 so the statement prints monthly salary.
   printf("%d", ((hourlyWage * 40 * 50) / 12));
   return 0;
}