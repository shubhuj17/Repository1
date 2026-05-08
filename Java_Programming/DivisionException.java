import java.util.*;

class DivisionException
{
    public static void main(String A[])
        {
            Scanner sobj = new Scanner(System.in);

            int No1 = 0, No2 = 0, Ans = 0;

            System.out.println("Enter First number :");
            No1 = sobj.nextInt();

            System.out.println("Enter second number :");
            No2 = sobj.nextInt();

            try
            {
                System.out.println("Inside Try block");
                Ans = No1 / No2;
            }
            catch(ArithmeticException aobj)
            {
                System.out.println("Inside Catch block");
                System.out.println("Exception occured :"+aobj);
            }

            System.out.println("Division is :"+Ans);

        }
    
    
}
