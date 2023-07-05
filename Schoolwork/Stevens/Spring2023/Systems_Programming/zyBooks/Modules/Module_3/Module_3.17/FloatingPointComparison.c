
#include <stdio.h>
#include <math.h>

int main(void) {
   double bodyTemp;
   
    //fabs() floating point absolute value
    //abs() is used for ints 

   printf("Enter body temperature in Fahrenheit: ");
   scanf("%lf", &bodyTemp);
   
   if (fabs(bodyTemp - 98.6) < 0.0001) {
      printf("Temperature is exactly normal.\n");
   }
   else if (bodyTemp > 98.6) {
      printf("Temperature is above normal.\n");
   }
   else {
      printf("Temperature is below normal.\n");
   }

      double sampleValue1 = 0.2;
   double sampleValue2 = 0.3;
   double sampleValue3 = 0.7;
   double sampleValue4 = 0.0;
   double sampleValue5 = 0.25;
   
   printf("samplevalue1 using just %%lf: %lf\n", 
          sampleValue1);

   printf("sampleValue1 is %.25lf\n", sampleValue1);
   printf("sampleValue2 is %.25lf\n", sampleValue2);
   printf("sampleValue3 is %.25lf\n", sampleValue3);
   printf("sampleValue4 is %.25lf\n", sampleValue4);
   printf("sampleValue5 is %.25lf\n", sampleValue5);
   

    double targetValue;
   double sensorReading;

   scanf("%lf", &targetValue);
   scanf("%lf", &sensorReading);

   if ((sensorReading - targetValue) < 0.0001) {
      printf("Equal\n");
   }
   else {
      printf("Not equal\n");
   }
   
   return 0;
}