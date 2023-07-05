#include <stdio.h>

int main(void) {
   int userChannel;
   char channelType;
   
   scanf("%d", &userChannel);
   
   if ((userChannel >= 2) && (userChannel <= 499)) {
      channelType = 's';
   }
   else if ((userChannel >= 1002) && (userChannel <= 1499)) {
      channelType = 'h';
   }
   else {
      channelType = 'e';
   }

   printf("Channel type: %c\n", channelType);

      int userAge;

   scanf("%d", &userAge);

   if (userAge >= 18 && userAge <=25) {
       printf("Eligible\n");
   }
   else {
      printf("Ineligible\n");
   }

   return 0;
}