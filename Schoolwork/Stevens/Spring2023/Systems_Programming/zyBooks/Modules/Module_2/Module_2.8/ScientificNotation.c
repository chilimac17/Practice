#include <stdio.h>

int main(void) {
   double avogadrosNumber = 6.02e23; // Approximation of atoms per mole  
   double gramsPerMoleGold = 196.9665;
   double gramsGold;
   double atomsGold;
   
   printf("Enter grams of gold: ");
   scanf("%lf", &gramsGold);
   
   atomsGold = gramsGold / gramsPerMoleGold * avogadrosNumber;
   
   printf("%lf grams of gold contains ", gramsGold);
   printf("%lf atoms\n", atomsGold);
   
   double G = 6.673e-11;
   double M = 5.98e24;
   double accelGravity;
   double distCenter;
   scanf("%lf", &distCenter);

   /* Your solution goes here  */

   printf("%lf\n", accelGravity);

   return 0;
}