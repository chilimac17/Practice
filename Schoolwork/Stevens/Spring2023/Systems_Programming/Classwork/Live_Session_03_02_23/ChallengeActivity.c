#include<stdio.h>
#include<string.h>
#include<stdbool.h>

bool isVowel(char ch);

void fileCounter(char input_file_name[10])
{
    //variables 
    char character;
    int upperCaseCount = 0;
    int vowelCount = 0;
    int digitCount = 0;
    int spaceCount = 0;
    int punctuationMarkCount = 0;

    //Creates output file
    FILE *input_file;
    FILE *output_file;

    //opens files
    input_file = fopen(input_file_name, "r");
    output_file = fopen("FileCharCounter.txt","w");

    if(input_file == NULL || output_file == NULL)
    {   
        printf("Error Opening File");
        exit(1);
    }

    while((character = getc(input_file)) != EOF)
    {
        if(isupper(character))
        {
            upperCaseCount++;
        }

        if(isdigit(character))
        {
            digitCount++;
        }

        if(isVowel(character))
        {
            vowelCount++;
        }

        if(isspace(character))
        {
            spaceCount++;
        }

        if(ispunct(character))
        {
            punctuationMarkCount++;
        }
    }

    printf("UpperCaseCount = %d\nVowelCount = %d\n DigitCount = %d\n SpaceCounter = %d\n PunctuationCount = %d\n", upperCaseCount, vowelCount, digitCount, spaceCount, punctuationMarkCount);

}

bool isVowel(char c)
{
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u')
    {
        return true;
    }
    else
    {
        return false;
    }
}

//conflicting types for "isVowel;" have'_Bool(char)'

int main()
{
    char user_input_file[10] = "input.txt";



    fileCounter(user_input_file);
    
    return 0;
}