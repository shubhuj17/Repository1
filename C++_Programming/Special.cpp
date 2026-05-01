#include<iostream>
using namespace std;

class Demo
{
    public:
        int i;                       //Charactristic
        float f;                     //Charactristic

        Demo()                       //Constructor
        {
            cout<<"Inside Constructor\n";
            i=0;
            f=0.0f;
        }
        
        ~Demo()                     //Destructor
        {
            cout<<"Inside Destructor\n";
        }

        void fun()                  //Behaviour
        {
            cout<<"Inside fun \n";
        }
        
};

int main()
{
    cout<<"Inside main\n";

    Demo dobj;                  //Object creation
   
    cout<<dobj.i<<"\n";

    dobj.fun();

    cout<<"End of main\n";

    return 0;
}