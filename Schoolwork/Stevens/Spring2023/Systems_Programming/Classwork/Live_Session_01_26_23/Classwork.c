#include <stdio.h>

int main(void) {
   int userNum1;
   int userNum2;
   int userNum3;
   int userNum4;
   
   //2.28 zyBooks Lab
   /* Type your code here. */
   scanf("%d %d %d %d",&userNum1, &userNum2, &userNum3,&userNum4);
   
   printf("%d %d\n", (userNum1 * userNum2 * userNum3 * userNum4), ((userNum1 + userNum2 + userNum3 + userNum4) / 4));
   printf("%0.3lf %0.3lf\n",((double)userNum1 * userNum2 * userNum3 * userNum4), ((userNum1 + userNum2 + userNum3 + userNum4) / 4.0));

   return 0;
}