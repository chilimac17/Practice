#include <math.h>
#include <stdio.h>

/* Converts a height in feet/inches to centimeters */
double HeightFtInToCm(int heightFt, int heightIn) {
   const double CM_PER_IN = 2.54;
   const int IN_PER_FT = 12;
   int totIn;
   double cmVal;
   
   totIn = (heightFt * IN_PER_FT) + heightIn; // Total inches
   cmVal = totIn * CM_PER_IN;                 // Conv inch to cm
   return cmVal;
}

double CalcCircularBaseArea(double radius) {
   return M_PI * radius * radius;
}

double CalcCylinderVolume(double baseRadius, double height) {
   return CalcCircularBaseArea(baseRadius) * height;
}

double CalcCylinderSurfaceArea(double baseRadius, double height) {
   return (2 * M_PI * baseRadius * height) + (2 * CalcCircularBaseArea(baseRadius));
}

int main(void) {
   int userFt;     // User defined feet
   int userIn;     // User defined inches

   // Prompt user for feet/inches
   printf("Enter feet: ");
   scanf("%d", &userFt);
   
   printf("Enter inches: ");
   scanf("%d", &userIn);

   // Output the conversion result
   printf("Centimeters: %lf\n",
          HeightFtInToCm(userFt, userIn));

       double radius;  // User defined feet
   double height;  // User defined height

   // Prompt user for radius
   printf("Enter base radius: ");
   scanf("%lf", &radius);

   // Prompt user for height
   printf("Enter height: ");
   scanf("%lf", &height);

   // Output the cylinder volume result
   printf("Cylinder volume: ");
   printf("%.1lf\n", CalcCylinderVolume(radius, height));


   // Output the cylinder surface area result
   printf("Cylinder surface area: ");
   printf("%.3lf\n", CalcCylinderSurfaceArea(radius, height));
   
   return 0;
