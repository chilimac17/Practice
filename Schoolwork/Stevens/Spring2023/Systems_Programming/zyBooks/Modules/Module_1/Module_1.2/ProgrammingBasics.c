#include <stdio.h>

int main(void) {
  //First Program 
  int wage;

  wage = 20;

  printf("Salary is ");
  printf("%d", wage * 40 * 52);
  printf("\n");

   int wage;
   
   scanf("%d", &wage); 

   printf("Salary is ");
   printf("%d\n", wage * 40 * 52);

    //Basic Input
   int dogYears;
   int humanYears;
   
   scanf("%d", &dogYears);
   humanYears = 7 * dogYears;

   printf("%d", dogYears);
   printf(" dog years is about ");
   printf("%d", humanYears);
   printf(" human years.\n");

    //Outputting text and new lines

   printf("Keep calm");
   printf("and");
   printf("carry on");

   printf("Keep calm\n");
   printf("and\n");
   printf("carry on\n");

   //Outputting a variable's value
    int wage;

   wage = 20;

   printf("Wage is: ");
   printf("%d", wage);
   printf("\n");
   printf("Goodbye.\n");

   //Outputting multiple items using one output statement.
   int wage;

   wage = 20;

   printf("Wage is: %d\n", wage); 
   printf("Goodbye.\n");

  return 0;
}