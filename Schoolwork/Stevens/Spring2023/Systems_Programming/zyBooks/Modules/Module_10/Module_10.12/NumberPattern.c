#include <stdio.h>

/* Define PrintNumPattern() here */
void PrintNumPattern(int n1, int n2)
{
   int tempVal = n1;
   
   printf("%d ", n1);
   
   if(n1 < 0)
   {
      if(tempVal == n1)
      {
         return;       
      }else{
         PrintNumPattern(n1+n2,n2);   
      }
      
   }else{
      PrintNumPattern(n1-n2,n2);
      printf("%d ", n1);
   }
   
   
}

int main(void) {
   int num1;
   int num2;
   
   scanf("%d", &num1);
   scanf("%d", &num2);
   PrintNumPattern(num1, num2);
}