#include <stdio.h>

double CalcPizzaArea() {
 double pizzaDiameter;
 double pizzaRadius;
 double pizzaArea;
 double piVal = 3.14159265;

 pizzaDiameter = 12.0;
 pizzaRadius = pizzaDiameter / 2.0;
 pizzaArea = piVal * pizzaRadius * pizzaRadius;
 return pizzaArea;
}

double CalcPizzaVolume(double pizzaDiameter, double pizzaHeight) {
   double pizzaRadius;
   double pizzaArea;
   double pizzaVolume;
   double piVal = 3.14159265;

   pizzaRadius = pizzaDiameter / 2.0;
   pizzaArea = piVal * pizzaRadius * pizzaRadius;
   pizzaVolume = pizzaArea * pizzaHeight;
   return pizzaVolume;
}

double CalcCircleArea(double circleDiameter) {
   double circleRadius;
   double circleArea;
   double piVal = 3.14159265;
   
   circleRadius = circleDiameter / 2.0;
   circleArea = piVal * circleRadius * circleRadius;
   
   return circleArea;
}

double PizzaCalories(double pizzaDiameter) {
   double totalCalories;
   double caloriesPerSquareInch = 16.7;    // Regular crust pepperoni pizza
   
   totalCalories = CalcCircleArea(pizzaDiameter) * caloriesPerSquareInch;
   
   return totalCalories;
}

int main(void) {
   printf("12.0 x 0.3 inch pizza is %lf inches cubed.\n", CalcPizzaVolume(12.0, 0.3));
   printf("12.0 x 0.8 inch pizza is %lf inches cubed.\n", CalcPizzaVolume(12.0, 0.8));
   printf("16.0 x 0.8 inch pizza is %lf inches cubed.\n", CalcPizzaVolume(16.0, 0.8));
   printf("12 inch pizza has %.2lf calories.\n", PizzaCalories(12.0));
   printf("14 inch pizza has %.2lf calories.\n", PizzaCalories(14.0));
   return 0;
}