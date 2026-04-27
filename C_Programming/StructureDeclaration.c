#include<stdio.h>


struct Demo      //Declaration of Structure
{
    int i;      //4
    float f;    //4
};              //8

int main()
{
    struct Demo dobj;

    printf("%lu\n",sizeof(dobj));


    return 0;
}