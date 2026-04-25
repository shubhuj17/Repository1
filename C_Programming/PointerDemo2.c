#include<stdio.h>
int main()
{
    char ch = 'A';
    char *cptr = &ch;

    int i = 11;
    int *iptr = &i;

    float f = 90.99f;
    float *fptr = &f;

    double d = 78.6780;
    double *dptr = &d;

    printf("%c \n",*cptr);
    printf("%d \n",*iptr);
    printf("%d \n",*fptr);
    printf("%d \n",*dptr);

    return 0;
}