#include  <stdio.h>
#include  <string.h>
#include  <sys/types.h>


void main(void)
{
    int pid = fork();
 

  if ( pid == 0 ) {
  printf("Child process");
  }
  wait( 2 );
}