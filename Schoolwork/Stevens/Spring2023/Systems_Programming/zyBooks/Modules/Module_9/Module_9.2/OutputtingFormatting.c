
#include <stdio.h>

int main(void) {
   double miles;      // User defined distance
   double hoursFly;   // Time to fly distance
   double hoursDrive; // Time to drive distance
   
   // Prompt user for distance
   printf("Enter a distance in miles: ");
   scanf("%lf", &miles);
   
   // Calculate the correspond time to fly/drive distance
   hoursFly = miles / 500.0;
   hoursDrive = miles / 60.0;
   
   // Output resulting values
   printf("%.2lf miles would take:\n", miles);
   printf("%.2lf hours to fly\n", hoursFly);
   printf("%.2lf hours to drive\n\n", hoursDrive);


      const unsigned long KM_EARTH_TO_SUN = 149598000;        // Dist from Earth to sun
   const unsigned long long KM_PLUTO_TO_SUN = 5906376272;  // Dist from Pluto to sun
   
   // Output distances with min number of characters
   printf("Earth is %11lu", KM_EARTH_TO_SUN);
   printf(" kilometers from the sun.\n");
   printf("Pluto is %11llu", KM_PLUTO_TO_SUN);
   printf(" kilometers from the sun.\n");
   
   return 0;
}