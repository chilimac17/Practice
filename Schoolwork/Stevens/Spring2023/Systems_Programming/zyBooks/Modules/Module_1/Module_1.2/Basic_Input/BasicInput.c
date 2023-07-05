#include <stdio.h>

int main(void)
{
    //Creates Variable named Wage
    int wage;

    //scanf takes input in from the user
    //sets the value of wage based on user input
    //the & character is a reference to a variable in memory
    //the %d indicates a decimal number
    scanf("%d",&wage);

    //printf prints output to the console
    printf("Salary is ");
    printf("%d", wage * 40 * 52);
    printf("\n");

    //outputting multiple lines example 
    int drivingYear;
    int drivingAge;
    int numStates;

    drivingYear = 2014;
    drivingAge = 18;
    numStates = 10;

    printf("In %d, the driving age is %d.\n", drivingYear , drivingAge);
    printf("%d states have exceptions.\n", numStates);

    //return 0 ends the program
    return 0;
}