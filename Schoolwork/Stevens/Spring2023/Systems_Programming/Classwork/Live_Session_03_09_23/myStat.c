#include<stdio.h>
#include<sys/types.h>
#include<sys/stat.h>
#include<unistd.h>
#include<errno.h>
#include<string.h>


int main(int argc, char* argv[]) {
   struct stat filestat;	//system struct defined to store info about files

   //check if argc has the correct number of arguments
   if (argc != 2) {
      fprintf(stderr, "usage: %s <file>\n", argv[0]);
      return 1;
   }
   //gather info about file given
   if (stat(argv[1], &filestat) == -1) {
      fprintf(stderr, "Can't read file %s: %s\n", argv[1], strerror(errno));
      return errno;
   }
   printf("File name: %s\n", argv[0]);
   printf("File argument: %s\n", argv[1]);
   printf("Number of arguments sent: %d\n", argc);

   return 0;
}
