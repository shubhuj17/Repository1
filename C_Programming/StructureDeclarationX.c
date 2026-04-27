#include<stdio.h>


struct Demo      //Declaration of Structure
{
    int i;      //4
    char ch;    //1    Generates Padding
    float f;    //4
};              //8

int main()
{
    struct Demo dobj;

    printf("%lu\n",sizeof(dobj));    //12


    return 0;
}