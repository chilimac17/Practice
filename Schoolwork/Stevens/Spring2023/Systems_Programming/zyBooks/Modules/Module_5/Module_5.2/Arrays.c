#include <stdio.h>

int main(void) {
   int itemCounts[3];

   itemCounts[0] = 122;
   itemCounts[1] = 119;
   itemCounts[2] = 117;

   printf("%d", itemCounts[1]);

   int oldestPeople[5]; 
   int nthPerson;       // User input, Nth oldest person
   
   oldestPeople[0] = 122; // Died 1997 in France
   oldestPeople[1] = 119; // Died 1999 in U.S.
   oldestPeople[2] = 117; // Died 1993 in U.S.
   oldestPeople[3] = 117; // Died 1998 in Canada
   oldestPeople[4] = 116; // Died 2006 in Ecuador
   
   printf("Enter N (1-5): ");
   scanf("%d", &nthPerson);
   
   if ((nthPerson >= 1) && (nthPerson <= 5)) {
      printf("The %dth oldest person lived ", nthPerson);
      printf("%d years.\n", oldestPeople[nthPerson-1]);
   }

   const int NUM_ELEMENTS = 5;
   int runTimes[NUM_ELEMENTS];
   int i;

   for (i = 0; i < NUM_ELEMENTS; ++i) {
      scanf("%d", &(runTimes[i]));
   }

   /* Your solution goes here  */
   for(int j =0; j < 3; j++)
   {
      printf("%d\n", runTimes[j]);
   }
   const int NUM_VALS = 4;
   int courseGrades[NUM_VALS];
   int i;

   for (i = 0; i < NUM_VALS; ++i) {
      scanf("%d", &(courseGrades[i]));
   }

   /* Your solution goes here  */
   i = 0; 
   for(i = 0; i < NUM_VALS; i++)
   {
      printf("%d ", courseGrades[i]);
   }
   
   printf("\n");
   
   for(int j = NUM_VALS - 1; j >= 0;  j--)
   {
      printf("%d ", courseGrades[j]);
      
   }
   
   printf("\n");
   return 0;
}