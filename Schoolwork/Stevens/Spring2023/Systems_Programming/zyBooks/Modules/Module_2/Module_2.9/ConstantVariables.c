#include <stdio.h>

/*
 * Estimates distance of lightning based on seconds
 * between lightning and thunder
 */

int main(void) {
   const double SPEED_OF_SOUND   = 761.207; // Miles/hour (sea level)
   const double SECONDS_PER_HOUR = 3600.0;  // Secs/hour
   double secondsBetween;
   double timeInHours;
   double distInMiles;

   printf("Enter seconds between lightning and thunder: ");
   scanf("%lf", &secondsBetween);

   timeInHours = secondsBetween / SECONDS_PER_HOUR;
   distInMiles = SPEED_OF_SOUND * timeInHours;

   printf("Lightning strike was approximately\n");
   printf("%lf", distInMiles);
   printf(" miles away.\n");

   int shipWeightPounds;
   int shipCostCents = 0;
   const int FLAT_FEE_CENTS = 75;

   /* Your solution goes here  */
   const int CENTS_PER_POUND;
   scanf("%d", &CENTS_PER_POUND);

   printf("Weight(lb): %d, Flat fee(cents): %d, Cents per pound: %d\nShipping cost(cents): %d\n",
          shipWeightPounds, FLAT_FEE_CENTS, CENTS_PER_POUND, shipCostCents);

   return 0;
}