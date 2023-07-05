//Bank of America ---> B.A.
//Bank Of America ---> B.O.A.
//BANK OF AMERICA ----> B.O.A.

#include<stdio.h>
#include<string.h>
#include<ctype.h>

//populate will prompt user for a input string
void populate(char* p, const int SIZE){
    printf("Enter a Phrase: ");
    fgets(p, SIZE, stdin);
}

//createAcronym proccess the phrase array
void createAcronym(const char* p, char* a, const int SIZE)
{
    //local variables
    int j = 0;
    
    for(int i =0; i < strlen(p); i++)
    {
        if(i != strlen(p) -1) //ensures boundary checking 
        {
            if(i == 0)
            {
                if(isupper(p[i]))
                {
                    a[j++] = p[i];
                    a[j++] = '.';
                }//end if isupper
            }//end if i == 0
        }else if(isspace(p[i])) // character after the first character 
        {
            if(isupper(p[i + 1]))
            {
                a[j++] = p[i + 1];
                a[j++] = '.';
            }//end if isupper
        }// end else if
    }//end for
    a[j] = '\0'; 
}// end createAcronym

//display
void display(const char* aa)
{
    printf("%s\n",aa);
}//end display

int main(){
    //variables
    const int SIZE = 50;
    char phrase[SIZE]; // hold user input
    char acronym[SIZE];//acronym 

    //prompt the user
    populate(phrase, SIZE);

    //create the acronym
    createAcronym(phrase,acronym,SIZE);

    //display the acronym array
    display(acronym);

    return 0;
}