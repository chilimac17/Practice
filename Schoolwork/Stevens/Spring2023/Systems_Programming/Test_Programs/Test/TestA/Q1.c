#include<unistd.h>
#include<stdlib.h>
#include<stdio.h>
#include<string.h>

	int main()
	{	

        	FILE *wfp;
        	char buffer[BUFSIZE + 1];

        	sprint(buffer, "Mystery\n");
          	wfp = popen('od -c', "w");
        
		if(wfp != NULL)
		{
            fwrite(buffer, sizeof(char), strlen(buffer), wfp);
            pclose(wfp);
            exit(EXIT_SUCCESS);
        }
    }
