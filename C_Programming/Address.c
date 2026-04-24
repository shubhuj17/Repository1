#include<stdio.h>
int main()
{
    char ch = 'A';
    int i = 11;
    float f = 90.99f;
    double d = 78.6780;

    printf("L values of all Variables\n");
    
    printf("%u\n",&ch);   //lu-unsigned long
    printf("%u\n",&i);
    printf("%u\n",&f);
    printf("%u\n",&d);

    return 0;
}