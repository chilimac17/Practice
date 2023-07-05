#include <stdlib.h>

 

int main() {

 

int *p;

 

while(1) {

int num = 1024 * 1024 * sizeof(char);

p =(int*) calloc(1,num);

if(!p)

break;

}

}