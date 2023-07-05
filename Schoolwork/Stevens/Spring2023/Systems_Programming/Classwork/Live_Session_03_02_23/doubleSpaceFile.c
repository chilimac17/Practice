#include<stdio.h>

//prototypes
void double_space(FILE *, FILE *);

int main() {

    //variables
    FILE *ifp;          //input file
    FILE *ofp;          //output file
    
    ifp = fopen("input.txt", "r");
    
    if (ifp == NULL) {          //did not open
        printf("Error opening file input.txt");
        return -1;
    }
    
    //open the output file
    ofp = fopen("output.txt", "w");
    
    //test if the file opened properly
    if (ofp == NULL) {
        printf("Error opening file output.txt");
        return -2;
    }
    
    //call double_space
    double_space(ifp, ofp);
   
    
    //print message to indicate complete
    printf("Done\n");
}

//double_space function
void double_space(FILE *ifp, FILE *ofp) {
    //local variable
    char c;

    while ((c = getc(ifp)) != EOF) {
        putc(c, ofp);
        if (c == '\n') {        //newline character found
            putc('\n', ofp);    //add another newline character
        } //end if
    } //end while
} //end double_space

