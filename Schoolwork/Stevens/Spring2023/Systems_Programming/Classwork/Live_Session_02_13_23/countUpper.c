//Count the number of uppercase characters in a paragraph

//1. Fix the program so it executes correctly
//2. Add a structure containing the variables (char * and int)
//3. Add a count and display the total number of spaces
//4. Add a count and display the total number of digits


#include<stdio.h>
#include<ctype.h>
#include<stdlib.h>

typedef struct userInput_struct{
	char* userString;
	int upperCaseNum;
}userInput;

int main(void) {

	//variables
	char* s;		//holds the input string from the user
	int countU = 0;		//counter for the number of uppercase chars
	int countSpace = 0;
	int countDigit = 0;

	//allocate space and test if successful
	if((s = malloc(100)) == NULL) {
		printf("malloc failed\n\n");
		exit(1);	//exit the program
	}

	//prompt the user
	printf("Enter a paragraph: ");
	fgets(s,100,stdin);

	//read character by character
	for (int i = 0; s[i] != '\n'; i++) 
	{
		if (isupper(s[i]))
		{
			countU++;
		}

		if(isspace(s[i]))
		{
			countSpace++;
		}
		
		if(isdigit(s[i]))
		{
			countDigit++;
		}

	}

	//free allocated space
	free(s);

	printf("The number of uppercase chars is: %d\n", countU);
	printf("The number of spaces is: %d\n", countSpace);
	printf("The number of digits is: %d\n", countDigit);
	return 0;
}