#include <stdio.h>

double avg(double total, int counter)
{
   return(total/counter);
}

int main(void) {

   /* TODO: Declare any necessary variables here. */
   const int MAX_STRING_SIZE = 25;
   FILE* inputFile;
   FILE* outputFile;
   char studentFirstName[MAX_STRING_SIZE];
   char studentLastName[MAX_STRING_SIZE];
   char fileName[MAX_STRING_SIZE];
   int counter;
   int studentAvg;
   int midterm1;
   int midterm2;
   int final;
   double midterm1Avg= 0;
   double midterm2Avg = 0;
   double finalAvg = 0;
   double midterm1Total = 0;
   double midterm2Total= 0;
   double finalTotal = 0;
   int readLine;
   
   scanf("%s", fileName);
   
   inputFile = fopen(fileName,"r");
   
   if(inputFile == NULL)
   {
      return -1;
   }
   
   outputFile = fopen("report.txt","w");
   
   if(outputFile == NULL)
   {
      return -1;
   }
      
      
   readLine = fscanf(inputFile, "%s\t%s\t%d\t%d\t%d",studentLastName,studentFirstName, &midterm1,&midterm2,&final);
   
   /* TODO: Read a file name from the user and read the tsv file here. */
   
   while(!feof(inputFile))
   {
      if(readLine == 5){
      fputs(studentLastName,outputFile);
      fputs("\t",outputFile);
      fputs(studentFirstName,outputFile);
      fputs("\t",outputFile);
      fprintf(outputFile, "%d\t", midterm1);
      fprintf(outputFile, "%d\t", midterm2);
      fprintf(outputFile, "%d\t", final);
      
      studentAvg = (midterm1 + midterm2 + final) / 3;
      
      if(studentAvg >= 90)
      {
         fputs("A\n",outputFile);
      }
      else if(studentAvg >= 80 && studentAvg < 90)
      {
         fputs("B\n",outputFile);
      }
      else if(studentAvg >= 70 && studentAvg < 80)
      {
         fputs("C\n",outputFile);
      }
      else if(studentAvg >= 60 && studentAvg < 70)
      {
         fputs("D\n",outputFile);
      }
      else if(studentAvg < 60)
      {
         fputs("F\n",outputFile);
      }
      
      
      
      midterm1Total += midterm1;
      midterm2Total += midterm2;
      finalTotal += final;
      
      counter++;

      readLine = fscanf(inputFile, "%s\t%s\t%d\t%d\t%d",studentLastName,studentFirstName, &midterm1,&midterm2,&final);
      }
   }
   
   putc('\n',outputFile);
   
   /* TODO: Compute student grades and exam averages, then output results to a text file here. */
   midterm1Avg = avg(midterm1Total,counter);
   midterm2Avg = avg(midterm2Total,counter);
   finalAvg = avg(finalTotal,counter);
   
   //Averages: midterm1 83.40, midterm2 76.60, final 61.60
   
   fputs("Averages: midterm1 ", outputFile);
   fprintf(outputFile, "%.2f", midterm1Avg);
   fputs(", ", outputFile);
   
   fputs("midterm2 ", outputFile);
   fprintf(outputFile, "%.2f", midterm2Avg);
   fputs(", ", outputFile);
   
   fputs("final ", outputFile);
   fprintf(outputFile, "%.2f", finalAvg);
   
   putc('\n',outputFile);
   
   
   fclose(inputFile);
   fclose(outputFile);
   
   return 0;
}
