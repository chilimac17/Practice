#include <stdio.h>

int main(void) {

   /* Type your code here. */
   int userNum;
   int total;
   int maxNum = 0;
   double count;
   double avg;
   
   scanf("%d",&userNum);
    if(maxNum < userNum)
    {
        maxNum = userNum;
    }

   while(userNum >= 0)
   {
      total += userNum;
      count++;
      scanf("%d",&userNum);
      
      if(maxNum < userNum){
         maxNum = userNum;
      }
   }
   
   avg = (total / count);
   
   printf("%d %0.2lf\n", maxNum, avg);

   return 0;
}
