#include <stdio.h>
#include <stdlib.h>
/**
 * @brief 
 * 
 *  A challenging but powerful programming construct is something called a pointer. This section illustrates one example's beneficial usage of pointers, namely pass by pointer function parameters.
 * A function can only return one value. 
 * But consider a desired function that converts total inches into feet and inches, e.g., 95 inches would be converted to 7 feet and 11 inches. 
 * To effectively return two values, the function can be defined with two pass by pointer parameters, by putting a * before a parameter name, and & before the corresponding argument variableparm.
 * The & passes the variable's memory address, known as a pointer, rather than the variable's value. 
 * The * before the parameter name indicates the parameter is a pointer. 
 * The function's statements can update each argument variable's memory location, effectively "returning" a value. 
 * The technique is also known as pass by reference, but the term pass by pointer avoids confusion with pass by reference parameters in C++ programs (which are different), and to more accurately describe this technique.
 * The following animation illustrates how pass by value does not work to return two values from a function.
 * 
 * Pass by pointer parameters should be used only when the output values are tightly related. 
 * New programmers commonly create one function with two outputs (using pass by pointer) to reduce coding, where two functions would have been better. 
 * For example, defining two functions int StepsToFeet(int baseSteps) and int StepsToCalories(int baseCalories) is better than defining a single function void StepsToFeetAndCalories(int baseSteps, int* feetTot, int* caloriesTot). Defining separate functions supports modular development, and enables use of the functions in an expression as in if (StepsToFeet(baseSteps) < 100).
 * Good candidates for multiple pass by pointer parameters might include computing the number of each type of coin to give as change, whose function might be void ComputeChange(int totCents, int* numQuarters, int* numDimes, int* numNickels, int* numPennies). Another example is converting from polar coordinates to Cartesian coordinates, whose function might be void PolarToCartesian(int radialPol, int anglePol, int* xCar, int* yCar). In both situations, the two outputs are tightly related.
 */


void ConvFeetInches(int totDist, int* inFeet, int* inInches) {
   *inFeet  = totDist / 12;
   *inInches = totDist % 12;
}

void SplitIntoTensOnes(int* tensDigit, int* onesDigit, int DecVal){
   *tensDigit = (DecVal / 10) % 10;
   *onesDigit = DecVal % 10;
}

void UpdateTimeWindow(int* timeStart,int* timeEnd,int offsetAmount)
{
   (*timeStart) += offsetAmount;
   (*timeEnd) += offsetAmount;
}

int main(void) {
   int initMeasure;
   int resFeet;
   int resIn;

   initMeasure = 45;
   resFeet = 0;
   resIn = 0;

   ConvFeetInches(initMeasure, &resFeet, &resIn);
   printf("%d feet %d inches\n", resFeet, resIn);

   int tensPlace;
   int onesPlace;
   int userInt;

   scanf("%d", &userInt);

   /* Your solution goes here  */
   SplitIntoTensOnes(&tensPlace,&onesPlace,userInt);

   printf("tensPlace = %d, onesPlace = %d\n", tensPlace, onesPlace);

   int timeStart;
   int timeEnd;
   int offsetAmount;

   scanf("%d", &timeStart);
   scanf("%d", &timeEnd);
   scanf("%d", &offsetAmount);
   printf("timeStart = %d, timeEnd = %d\n", timeStart, timeEnd);

   UpdateTimeWindow(&timeStart, &timeEnd, offsetAmount);
   printf("timeStart = %d, timeEnd = %d\n", timeStart, timeEnd);

   return 0;
}