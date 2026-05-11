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


class RMD_OverriddingX
{
    public static void main(String A[])
    {
        
        Base bobj = new Derived();  //upcasting 

        bobj.fun();     //Base fun
        bobj.gun();     //Derived gun
        bobj.sun();     //Derived sun
        
    }
        
        

}