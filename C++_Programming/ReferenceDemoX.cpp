#include <iostream>
using namespace std;

int main()
{
    // we can create one refernece to one variable
    int no = 11;
    int &x = no;

    // we can create multiple references for single variable
    int &y = no;

    // we can create refernce to reference 
    int &z = y;

    // we can create reference to pointer 
    int *p = & no;
    int *(&q) = p;
    
    return 0;
}