class Demo extends Thread
{
    public void run()
    {
        int i = 0;

        try
        {

       
        for(i = 1; i<=10; i++)
        {
            System.out.println("Inside run method of :"+Thread.currentThread().getName()+":"+i);
            Thread.sleep(3000);
        }
    }
        catch(Exception eobj)
        {}
        }
    }


class MultiThreadingSleep
{
    public static void main (String A[]) throws Exception
    {
        System.out.println("Main Thread is running....");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        
        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

        dobj1.join();
        dobj2.join();

        System.out.println("End of Main Thread");
    }
}


/*
output:
Main Thread is running....
Inside run method of :First:1
Inside run method of :Second:1
Inside run method of :First:2
Inside run method of :Second:2
Inside run method of :First:3
Inside run method of :Second:3
Inside run method of :First:4
Inside run method of :Second:4
Inside run method of :First:5
Inside run method of :Second:5
Inside run method of :First:6
Inside run method of :Second:6
Inside run method of :First:7
Inside run method of :Second:7
Inside run method of :First:8
Inside run method of :Second:8
Inside run method of :Second:9
Inside run method of :First:9
Inside run method of :Second:10
Inside run method of :First:10
End of Main Thread
*/