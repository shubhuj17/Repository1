import java.util.*;

class DivisionExceptionFinally
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
            catch(Exception eobj)
            {
                System.out.println("Inside Generic catch :"+eobj);
            }
            finally
            {
                System.out.println("Inside finally block");
                sobj = null;    //resource deallocation
            }

            System.out.println("Division is :"+Ans);

        }
    
    
}
