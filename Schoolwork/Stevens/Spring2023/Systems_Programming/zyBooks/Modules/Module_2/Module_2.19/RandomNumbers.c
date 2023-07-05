
#include <stdio.h>
#include <stdlib.h>   // Enables use of rand()
#include <time.h>     // Enables use of time()

int main(void) {
   printf("%d\n", rand());
   printf("%d\n", rand());
   printf("%d\n", rand());

   printf("RAND_MAX: %d\n", RAND_MAX);

    // Switch a student
    // from a random seat on the left  (cols  1 to 15)
    //   to a random seat on the right (cols 16 to 30)
    // Seat rows are 1 to 20

  int rowNumL;
  int colNumL;
  int rowNumR;
  int colNumR;

   rowNumL = (rand() % 20) + 1;  // 1 to 20
   colNumL = (rand() % 15) + 1;  // 1 to 15

   rowNumR = (rand() % 20) + 1;  // 1 to 20
   colNumR = (rand() % 15) + 16; // 16 to 30

   printf("Move from ");
   printf("row %d col %d", rowNumL, colNumL);
   printf(" to ");
   printf("row %d col %d\n", rowNumR, colNumR);

   //PSEUDO-RANDOM

   srand((int)time(0)); // Unique seed
   printf("%d\n", rand());
   printf("%d\n", rand());
   printf("%d\n", rand());

      int seedVal;

   scanf("%d", &seedVal);

   /* Your solution goes here  */
   srand(seedVal);
   //this doesn't work
   //expected output flipped 
   //printf("%d\n%d\n", (rand() % 10),  (rand() % 10));
   printf("%d\n", rand() % 10);
   printf("%d\n", rand()% 10);

      /* Your solution goes here  */
   printf("%d\n", (rand() % 50) + 100 );
   printf("%d\n", (rand() % 50) + 100 );



   return 0;
}