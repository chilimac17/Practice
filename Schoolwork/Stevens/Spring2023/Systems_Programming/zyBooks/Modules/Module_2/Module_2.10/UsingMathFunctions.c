#include <stdio.h>
#include <math.h>

int main(void) { 
   double sideSquare;
   double areaSquare = 49.0;
 
   sideSquare = sqrt(areaSquare);

   printf("Square root of %lf", areaSquare);
   printf(" is %lf\n", sideSquare);

    //Mass Growth
   double initMass;   // Initial mass of a substance
   double growthRate; // Annual growth rate
   double yearsGrow;  // Years of growth
   double finalMass;  // Final mass after those years
   
   printf("Enter initial mass: ");
   scanf("%lf", &initMass);
   
   printf("Enter growth rate (Ex: 0.05 is 5%%/year): ");
   scanf("%lf", &growthRate);
   
   printf("Enter years of growth: ");
   scanf("%lf", &yearsGrow);
   
   finalMass = initMass * pow(1.0 + growthRate, yearsGrow);
   // Ex: Rate of 0.05 yields initMass * 1.05^yearsGrow
   
   printf("Final mass after %lf years is: %lf\n",
          yearsGrow, finalMass);

   double x;

   x = sqrt(9.0);

   // This will output 1 decimal place
   printf("%.1lf\n", x);

   double x9;
   double y8;
   double z7;

   scanf("%lf", &x9);
   scanf("%lf", &y8);

   /* Your code goes here */

   printf("%.2lf\n", z7);

   //Distance Formula
   double x1;
   double y1;
   double x2;
   double y2;
   double xDist;
   double yDist;
   double pointsDistance;

   xDist = 0.0;
   yDist = 0.0;
   pointsDistance = 0.0;

   scanf("%lf", &x1);
   scanf("%lf", &y1);
   scanf("%lf", &x2);
   scanf("%lf", &y2);

   /* Your solution goes here  */

   printf("%lf\n", pointsDistance);


   return 0;
}