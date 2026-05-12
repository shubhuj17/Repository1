public interface  Circle
{
    //Characteristics       (public static final)
    float PI = 3.14f;         

    //Behaviour         (public abstract)
    float Area(float Radius);
    float Circumfarance(float Radius);
} 

class Marvellous implements Circle
{
        //Error Due to missing body of Area and Circumfarance 
}

class DemoInterfaceMethod
{
    public static void main (String A[])
    {
        Marvellous mobj = new Marvellous();
    }    
}
