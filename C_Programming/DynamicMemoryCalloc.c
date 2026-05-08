#include<stdio.h>
#include<stdlib.h> 
//for malloc,calloc,realloc

int main()
{
    
    int Size = 0;       
    float *Marks = NULL;
    int i = 0;  //Loop counter

    printf("Enter number of elements: \n");
    scanf("%d",&Size);

    //Dynamic Memory Allocation
    Marks = (float*)calloc(Size , sizeof(float));

    printf("Enter your marks:\n");

    //float Marks[5];  //20 bytes

    //Iteration
    //   1    2    3
    for(i=0; i<Size; i++)
    {
        scanf("%f",&Marks[i]);  //4
    }

    printf("Entered marks are: \n");
   
    //   1    2    3
    for(i=0; i<Size; i++)
    {
        printf("%f\n",Marks[i]);  //4
    }

    free(Marks);

    return 0;
}