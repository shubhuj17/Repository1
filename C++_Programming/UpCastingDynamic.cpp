#include<iostream>
using namespace std;

class Base
{
    public :
        int i , j;
}; //8bytes

class Derived : public Base
{
    public:
        int x,y;
}; //16bytes

int main()
{

    Base *bp = NULL;
    

    bp = new Derived(); //upcasting


    return 0;
};