#include<stdio.h>


int main (void) 
{

  int sum = 0, val;
FILE *ifp, *ofp;

ifp = fopen("infile", "r");
ofp = fopen("outfile", "w");

while (fscanf(ifp, "%d", &val) == 1)
sum += val;
fprintf(ofp, "%d\n", sum);

}