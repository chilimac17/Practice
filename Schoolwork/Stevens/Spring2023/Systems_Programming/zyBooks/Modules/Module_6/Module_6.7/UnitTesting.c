#include <stdio.h>
#include <assert.h>

double HrMinToMin(int origHours, int origMinutes) {
   int totMinutes;  // Resulting minutes
   
   totMinutes = (origHours * 60) + origMinutes;
   
   return origMinutes;
}

int HrMinToMin(int origHours, int origMinutes) {
   int totMinutes;  // Resulting minutes
   
   totMinutes = (origHours * 60) + origMinutes;
   
   return origMinutes;
}

int main(void) {
   
   printf("Testing started\n");
   
   printf("0:0, expecting 0, got: %lf\n",    HrMinToMin(0,0) );
   printf("0:1, expecting 1, got: %lf\n",    HrMinToMin(0,1) );
   printf("0:99, expecting 99, got: %lf\n",  HrMinToMin(0,99));
   printf("1:0, expecting 60, got: %lf\n",   HrMinToMin(1,0) );
   printf("5:0, expecting 300, got: %lf\n",  HrMinToMin(5,0) );
   printf("2:30, expecting 150, got: %lf\n", HrMinToMin(2,30));
   // Many more test vectors would be typical...
   
   printf("Testing completed\n");

   printf("Testing started\n");
   
   assert(HrMinToMin(0, 0) == 0);
   assert(HrMinToMin(0, 1) == 1);
   assert(HrMinToMin(0, 99) == 99);
   assert(HrMinToMin(1, 0) == 60);
   assert(HrMinToMin(5, 0) == 300);
   assert(HrMinToMin(2, 30) == 150);
   // Many more test vectors would be typical...
   
   printf("Testing completed\n");

   
   return 0;
}