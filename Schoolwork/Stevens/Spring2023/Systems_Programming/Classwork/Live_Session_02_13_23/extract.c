#include<stdio.h>

//prototypes go here
void populate(int*, const int);

void display(const int*,const int*, const int, const int);

int extract(const int*,  int*, int*,const int);

int main()
{
    // local variables
    const int SIZE = 5;
    int nums[SIZE];
    int odds[SIZE];
    int evens[SIZE];

    int oCount =0;

    populate(nums,SIZE);

    //extract the odd and evens 
    oCount = extract(nums, odds, evens, SIZE);

    //display
    display(odds,evens,oCount,SIZE);

    return 0;
}

//display the odd and even arrays
void display(const int* o,const int* e, const int count, const int SIZE)
{
    printf("Odds array \n");
    for(int i = 0; i < count; i++ )
    {
        printf("%d", o[i]);
    }

    printf("\n\nEvens array \n");
    for(int i = 0; i < SIZE - count; i++ )
    {
        printf("%d", e[i]);
    }

    printf("\n");
}

//extract will determine if a number from the nums array is odd or even and place
//the value within the appropriate array
int extract(const int* n, int* o, int* e, const int SIZE)
{
    //variable
    int count = 0;
    int eCount = 0;
    int oCount = 0;
    for(int i =0; i < SIZE; i++)
    {
        if(n[i] % 2 == 0)
        {
            e[eCount++] = n[i];
        }
        else
        {
            o[oCount++] = n[i];
        }
    }
    return oCount;
} // end extract

//populate prompt the user to populate the nums array
void populate(int* n, const int SIZE)
{
    for(int i = 0; i < SIZE; i++)
    {   
        printf("Enter a value: ");
        while (scanf("%d", &n[i]) != 1) //bad read ?
        {
            while(getchar() != '\n'); // clear input buffer 
            printf("Error, numeric input only. Try again: ");
        }
    }//end for
}// end populate