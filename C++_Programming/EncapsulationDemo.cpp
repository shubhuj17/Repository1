#include<iostream>
using namespace std;


//Encpasulation
class Marvellous
{
    //Access Specifier
    public:
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

    cout<<mobj1.No1<<"\n";
    
    mobj1.Fun();
    mobj2.Fun();

    mobj1.Gun();
    return 0;
}