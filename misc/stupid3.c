/* program to generate pretty colors */
#include <stdio.h>

typedef struct {
	char * fileName;
	signed int width;
	signed int height;
} ppm_img;

void create_img(ppm_img img){
	/* hardcoded name, change later */
	FILE *f = fopen("output.ppm","w");
	int i,j;
	fprintf(f,"P3\n");
	fprintf(f,"%d %d\n",img.width,img.height);
	fprintf(f,"%d\n",255);
	for (i = 0; i < img.width; i++){
		for (j = 0; j < img.height; j++){
			int r = (i * img.width) / img.width;
			int g = (i * img.width) / img.width;
			int b = 128;
			fprintf(f,"%d %d %d\n",r,g,b);
		}
	}
	fclose(f);
}

int main() {
	ppm_img img;
	img.width = 255;
	img.height = 255;
	create_img(img);
	printf("Image created.\n");
	return 0;
}
