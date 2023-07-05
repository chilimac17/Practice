#include <stdio.h>

int main(void) {

    /**
     * @brief 
     * The following program calculates weekly salary and assumes work-hours-per-week limit of 40.
     * Overtime refers to hours worked per week in excess of some weekly limit, such as 40 hours. 
     * Some companies pay time-and-a-half for overtime hours, meaning overtime hours are paid at 1.5 times the hourly wage.
     * Overtime pay can be calculated with pseudocode as follows (assuming a weekly limit of 40 hours):

     * weeklyLimit = 40     
     * if weeklyHours <= weeklyLimit
     *    weeklySalary = hourlyWage * weeklyHours
     * else
     *   overtimeHours = weeklyHours - weeklyLimit
     *   weeklySalary = hourlyWage * weeklyLimit + (overtimeHours * hourlyWage * 1.5)
     * 
     * Run the program and observe the salary earned.
     * Modify the program to read user input for weeklyHours. Run the program again.
     * 
     */

   int hourlyWage;
   int weeklyHours;
   int weeklySalary;
   int overtimeHours;
   const int WEEKLY_LIMIT = 40;

   printf("Enter hourly wage: \n");
   scanf("%d", &hourlyWage);

   printf("Enter weekly hours: \n");
   scanf("%d", &weeklyHours);


   if (weeklyHours <= WEEKLY_LIMIT) {
      weeklySalary = weeklyHours * hourlyWage;
   }
   else {
      overtimeHours = weeklyHours - WEEKLY_LIMIT;
      weeklySalary = (int)((hourlyWage * WEEKLY_LIMIT) +
                           (hourlyWage * overtimeHours * 1.5));
   }
   
   printf("Weekly salary is: %d\n", weeklySalary);

/**
 * @brief 
 * Run the program with an annual income of 120000. Note the tax rate and tax to pay.
 * Modify the program to add a new tier: Annual income above 50000 but less than or equal to 100000 is taxed at the rate of 30%, and annual income above 100000 is taxed at 40%.
 * Run the program again with an annual income of 120000. What is the tax rate and tax to pay now?
 * Run the program again with an annual income of 60000. (Change the input area below the program.)
 * Challenge: What happens if a negative annual salary is entered? Modify the program to print an error message in that case
 * 
 */

      int annualSalary;
   double taxRate;
   int taxToPay;

   printf("Enter annual salary: \n");
   scanf("%d", &annualSalary);

   // Determine the tax rate from the annual salary
   // FIXME: Write code to address the challenge question above
   if (annualSalary <= 20000) {
      taxRate = 0.10;
   }
   else if (annualSalary <= 50000) {
      taxRate = 0.20;
   }
   // FIXME: Add tier
   else if(annualSalary >= 100000) {
      taxRate = 0.40;  
   }
   else {
      taxRate = 0.30;
   }

   taxToPay = (int)(annualSalary * taxRate);     // Truncate tax to an integer amount

   printf("Annual Salary: %d\n", annualSalary);
   printf("Tax rate: %lf\n", taxRate);
   printf("Tax to pay: %d\n", taxToPay);

   return 0;
}