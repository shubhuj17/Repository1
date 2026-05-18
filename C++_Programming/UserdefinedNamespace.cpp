#include<iostream>

namespace Marvellous
{
    int no =11;

    void fun()
    {
        std::cout<<"Marvellous\n";
    }
}

int main()
{
    std::cout<<"Jay Ganesh...\n";
    fun();          //error
    return 0;
}

/*
error
UserdefinedNamespace.cpp: In function 'int main()':
UserdefinedNamespace.cpp:16:9: error: 'fun' was not declared in this scope
     fun();
         ^
UserdefinedNamespace.cpp:16:9: note: suggested alternative:
UserdefinedNamespace.cpp:7:10: note:   'Marvellous::fun'
     void fun()
          ^~~
*/