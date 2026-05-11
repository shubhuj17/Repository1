#include<iostream>
using namespace std;

class Base
{
    public:
        int i,j;

        int Add(int a, int b)       //1000
        {
            return a+b;
        }

        virtual int Sub(int a,int b) = 0;
};

class Derived : public Base
{
    public:
        int x,y;

        int Mult(int a,int b)       //2000
        {
            return a*b;
        }

        int Sub(int a,int b)        //3000
        {
            return a-b;
        }
};

int main()
{
    Base *bptr = new Derived();

    cout<<"Addition: "<<bptr->Add(20,5)<<"\n";
    cout<<"Substraction: "<<bptr->Sub(20,5)<<"\n";

    Derived *dptr = new Derived();
    cout<<"Multiplication: "<<dptr->Mult(20,5)<<"\n";

    delete bptr;
    delete dptr;

    return 0;
}
