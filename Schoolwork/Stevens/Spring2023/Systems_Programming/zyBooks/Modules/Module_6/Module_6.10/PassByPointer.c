#include <stdio.h>

void ConvHrMin (int timeVal, int* hrVal, int* minVal) {
   *hrVal  = timeVal / 60;
   *minVal = timeVal % 60;
}

int main(void) {
   int totTime;
   int usrHr;
   int usrMin;
 
   totTime = 0;
   usrHr = 0;
   usrMin = 0;
 
   printf("Enter total minutes: ");
   scanf("%d", &totTime);
 
   ConvHrMin(totTime, &usrHr, &usrMin);
 
   printf("Equals: %d hrs %d mins\n", usrHr, usrMin);

   return 0;
}