abstract class Demo
{
    public int i,j;

    public int Add(int a, int b)        //concrete method
    { 
        return a+b;
    }

    public int Sub(int a, int b)        //abstract method
    {
        return a-b;
    }
}

class Hello extends Demo
{

}


class Abstract_DemoX
{
    public static void main (String A[])
    {
        Hello hobj = new Hello();
    }
}