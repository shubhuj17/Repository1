class StringCompare
{
    public static void main (String A[])
    {
        String s1 = "Ganesh";
        String s2 = new String("Ganesh");

        if(s1 == s2)    // == -> comparisan operator
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
Strings are not Equal
(because they comparing references not data)

*/