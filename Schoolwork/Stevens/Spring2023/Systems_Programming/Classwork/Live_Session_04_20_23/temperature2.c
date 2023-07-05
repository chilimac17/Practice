//This is the same program as temperature.c with one exception.
//Notice the #include statement for convert.h.  It no longer
//has quotation marks indicating it is found in the local 
//directory, but is contained within < > so the system
//will now look in /usr/local/include for the convert.h file

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <convert.h>

//prototype
void printUsage(FILE*, char[]);

int main(int argc, char *argv[]) {

        //three arguments are needed
        if (argc != 3) {
                printUsage(stderr, argv[0]);
                return 1;
        }

        //Convert Celsius to Fahrenheit
        if(strcmp(argv[1], "-f") == 0) {
                printf("%.lf C = %.lf F\n",
                        atof(argv[2]), c_to_f(atof(argv[2])));
        }
        //Convert Celsius to Kelvin
        else if (strcmp(argv[1], "-k") == 0) {
                printf("%.lf C = %.lf F\n",
                        atof(argv[2]), c_to_k(atof(argv[2])));
        }
        //error
        else {
                printUsage(stderr, argv[0]);
                return 1;
        }

        return 0;
} 

//function printUsage
void printUsage(FILE *stream, char progname[]) {
        fprintf(stream, "%s [-f] [-k] [temperature]\n"
                "Example: %s -f 25\n", progname, progname);
}
