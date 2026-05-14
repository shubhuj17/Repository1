class StringCompareX
{
    public static void main (String A[])
    {
        String s1 = "Ganesh";
        String s2 = new String("Ganesh");

        if(s1.equals(s2))    //equals -> it is using for data comparison
        {
            System.out.println("Strings are Equal");
        }
        else
        {
            System.out.println("Strings are not Equal");  
        }

    }
}

/* 
output:
Strings are Equal
*/

