#include <stdio.h>

int main(void) {
   int salaryPerYear; // User input: Yearly salary
   int daysPerYear;   // User input: Days worked per year
   int salaryPerDay;  // Output:     Salary per day

   printf("Enter yearly salary: ");
   scanf("%d", &salaryPerYear);

   printf("Enter days worked per year: ");
   scanf("%d", &daysPerYear);

   // If daysPerYear is 0, then divide-by-zero causes program termination.
   salaryPerDay = salaryPerYear / daysPerYear;

   printf("Salary per day is: %d\n", salaryPerDay);

   int userMinutes;  // User input: Minutes
   int outHours;     // Output hours
   int outMinutes;   // Output minutes (remaining)

   printf("Enter minutes: ");
   scanf("%d", &userMinutes);

   outHours   = userMinutes / 60;
   outMinutes = userMinutes % 60;

   printf("%d minutes is ", userMinutes);
   printf("%d hours and ", outHours);
   printf("%d minutes.\n", outMinutes);

   int amountToChange;
   int numFives;
   int numOnes;

   scanf("%d", &amountToChange);
   numFives = amountToChange / 5;

   /* Your solution goes here  */

   printf("numFives: %d\n", numFives);
   printf("numOnes: %d\n", numOnes);

   return 0;
}