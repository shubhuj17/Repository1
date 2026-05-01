#include<iostream>
using namespace std;


//Encpasulation
class Marvellous
{
    //Access Specifier
    public:
        int No1,No2;        //characteristics

    //Deafult constructor
    Marvellous()
    {
        cout<<"Inside Default Constructor\n";
        No1 = 0;
        No2 = 0;
    }

    //Parametrized Constructor
    Marvellous(int A, int B)
    {
        cout<<"Inside Parametrized Constructor\n";
        No1 = A;
        No2 = B;
    }

    //Copy Constructor
    Marvellous(Marvellous &ref)
    {
        cout<<"Inside Copy Constructor\n";
        No1 = ref.No1;
        No2 = ref.No2;
    }


    //Destructor
    ~Marvellous()
    {
        cout<<"Inside Destructor\n";
    }
    
};

int main()
{
    cout<<"Inside Main\n";

    Marvellous mobj1();         //default Constructor
    Marvellous mobj2(11,21);    //Parametrised Constructor
    Marvellous mobj3(mobj2);    //Copy Constructor

    cout<<"End of Main\n";
    return 0;
}   //All destructors get called