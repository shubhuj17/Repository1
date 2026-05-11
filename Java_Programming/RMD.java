class Base
{
    public int i,j;
    
    public void fun()
    { System.out.println("Inside base fun"); }

    public void gun()
    { System.out.println("Inside base gun"); }

    public void sun()
    { System.out.println("Inside base sun"); }

}

class Derived extends Base
{
    public int x,y;

    public void gun()
    { System.out.println("Inside Derived gun"); }

    public void sun()
    { System.out.println("Inside Derived sun"); }

    public void run()
    { System.out.println("Inside Derived run"); }

}


class RMD
{
    public static void main(String A[])
    {
        //Base bobj = new Base(); //no casting
        Base bobj = new Derived();  //upcasting 
        
        //Derived dobj = new Derived();   //no casting 
        Derived dobj = new Base();  //downcasting 
    }

}