#include<iostream>
using namespace std;


//Encpasulation
class Marvellous
{
    //Access Specifier (By default private)

    int No1,No2;        //characteristics

    void Fun()              //Behaviour
    {
        cout<<"Inside Fun\n";
    }

    void Gun()              //Behaviour
    {
        cout<<"Inside Gun\n";
    }
    
};

int main()
{
    //object creation (Instance)
    Marvellous mobj1;
    Marvellous mobj2;

    cout<<sizeof(mobj1)<<"\n";  

    cout<<mobj1.No1<<"\n";      //Error
    
    mobj1.Fun();                //Error
    mobj2.Fun();                //Error

    mobj1.Gun();                //Error
    return 0;
}