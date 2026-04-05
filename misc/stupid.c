/* I've been learning C. It sucks. */
#include <stdio.h>

int main(void) /* to be changed to accept command line arguments... maybe */
{
  FILE *f = fopen("test.txt", "a+");
  int user = getchar();

  while (user != EOF) {
    fprintf(f, "%c", user);
    user = getchar();
    }
  fclose(f);
  return 0;
}

/* Never been able to do file handling until now */
/* time to spend the rest of easter cookin' up structs */
