/* program to temporarily save character command line arguments */
#include <stdio.h>
int main(int argc, char **argv){ 
        if (argc <= 1){ 
                fprintf(stderr,"%s%s",argv[0]," err: must provide arguments.\n");
                return 1;
        }   
        int i;
        char arr[argc - 1]; 
        for (i = 1; i < argc; i++){
                arr[i-1] = *argv[i];
        }   
        FILE *f = fopen("output.txt","w+");
        for (i = 0; i < argc - 1; i++){
                fprintf(f,"%c",arr[i]);
        }   
        fclose(f);
        return 0;
}
/* should be platform independent... only uses stdio */
