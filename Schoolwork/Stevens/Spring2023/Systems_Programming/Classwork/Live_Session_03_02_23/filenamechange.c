#include<stdio.h>
#include<string.h>

int main() {
    //variables
    const int SIZE = 100;
    char inputFileName[SIZE];   //input file name
    char fileName[SIZE];        //read in file from user
    char *substring;            //substring value
    int  read;                  //successful read or not

    FILE* inFile;               //pointer to the input file

    //get the name of the input file
    printf("Enter the name of the input file: ");
    scanf("%s", inputFileName);

    //open the input file
    inFile = fopen(inputFileName, "r");

    //priming read 
    read = fscanf(inFile, "%s", fileName);

    //loop until eof
    while (!feof(inFile)) 
    {

        if(read == 1) 
        {         //successful read
            //find the beginning of the substring in filename to be replaced
            substring = strstr(fileName, "photo.jpg");

            //overwrite with new substring
            strcpy(substring, "info.txt");

            //display the new file name
            printf("%s\n", fileName);

            //read the next line in the input file
            read = fscanf(inFile, "%s", fileName);
        } //end if
        else {
            printf("Error, input failure\n");
            break;
        }//end else
    }//end while

    fclose(inFile);     //close the input file

    return 0;
}//end main

