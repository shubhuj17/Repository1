class Demo extends Thread
{
    public void run()
    {
        int i = 0;

        for(i = 1; i<=100; i++)
        {
            System.out.println("Inside run method of :"+Thread.currentThread().getName()+":"+i);
        }
    }
}

class MultiThreadingLoopX
{
    public static void main (String A[])
    {
        System.out.println("Main Thread is running....");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        
        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

        System.out.println("End of Main Thread");
    }
}


/*
output:
Main Thread is running....
End of Main Thread
Inside run method of :First:1
Inside run method of :Second:1
Inside run method of :Second:2
Inside run method of :First:2
Inside run method of :First:3
Inside run method of :First:4
Inside run method of :First:5
Inside run method of :Second:3
Inside run method of :Second:4
Inside run method of :First:6
Inside run method of :Second:5
Inside run method of :Second:6
Inside run method of :First:7
Inside run method of :First:8
Inside run method of :First:9
Inside run method of :First:10
Inside run method of :First:11
Inside run method of :First:12
Inside run method of :First:13
Inside run method of :First:14
Inside run method of :First:15
Inside run method of :First:16
Inside run method of :First:17
Inside run method of :First:18
Inside run method of :First:19
Inside run method of :First:20
Inside run method of :First:21
Inside run method of :First:22
Inside run method of :First:23
Inside run method of :First:24
Inside run method of :First:25
Inside run method of :First:26
Inside run method of :First:27
Inside run method of :First:28
Inside run method of :Second:7
Inside run method of :Second:8
Inside run method of :Second:9
Inside run method of :Second:10
Inside run method of :Second:11
Inside run method of :Second:12
Inside run method of :Second:13
Inside run method of :Second:14
Inside run method of :Second:15
Inside run method of :Second:16
Inside run method of :Second:17
Inside run method of :Second:18
Inside run method of :Second:19
Inside run method of :Second:20
Inside run method of :Second:21
Inside run method of :Second:22
Inside run method of :Second:23
Inside run method of :Second:24
Inside run method of :Second:25
Inside run method of :Second:26
Inside run method of :Second:27
Inside run method of :Second:28
Inside run method of :Second:29
Inside run method of :Second:30
Inside run method of :Second:31
Inside run method of :First:29
Inside run method of :First:30
Inside run method of :First:31
Inside run method of :First:32
Inside run method of :First:33
Inside run method of :First:34
Inside run method of :Second:32
Inside run method of :First:35
Inside run method of :First:36
Inside run method of :First:37
Inside run method of :First:38
Inside run method of :Second:33
Inside run method of :First:39
Inside run method of :First:40
Inside run method of :Second:34
Inside run method of :First:41
Inside run method of :Second:35
Inside run method of :First:42
Inside run method of :Second:36
Inside run method of :First:43
Inside run method of :Second:37
Inside run method of :Second:38
Inside run method of :First:44
Inside run method of :Second:39
Inside run method of :Second:40
Inside run method of :First:45
Inside run method of :First:46
Inside run method of :First:47
Inside run method of :First:48
Inside run method of :Second:41
Inside run method of :Second:42
Inside run method of :Second:43
Inside run method of :Second:44
Inside run method of :First:49
Inside run method of :First:50
Inside run method of :First:51
Inside run method of :Second:45
Inside run method of :Second:46
Inside run method of :First:52
Inside run method of :First:53
Inside run method of :Second:47
Inside run method of :First:54
Inside run method of :First:55
Inside run method of :Second:48
Inside run method of :Second:49
Inside run method of :Second:50
Inside run method of :Second:51
Inside run method of :First:56
Inside run method of :First:57
Inside run method of :Second:52
Inside run method of :Second:53
Inside run method of :Second:54
Inside run method of :Second:55
Inside run method of :Second:56
Inside run method of :Second:57
Inside run method of :First:58
Inside run method of :Second:58
Inside run method of :Second:59
Inside run method of :Second:60
Inside run method of :First:59
Inside run method of :First:60
Inside run method of :Second:61
Inside run method of :First:61
Inside run method of :Second:62
Inside run method of :First:62
Inside run method of :Second:63
Inside run method of :First:63
Inside run method of :First:64
Inside run method of :First:65
Inside run method of :Second:64
Inside run method of :First:66
Inside run method of :Second:65
Inside run method of :First:67
Inside run method of :Second:66
Inside run method of :First:68
Inside run method of :Second:67
Inside run method of :Second:68
Inside run method of :First:69
Inside run method of :First:70
Inside run method of :Second:69
Inside run method of :First:71
Inside run method of :Second:70
Inside run method of :First:72
Inside run method of :Second:71
Inside run method of :First:73
Inside run method of :Second:72
Inside run method of :Second:73
Inside run method of :Second:74
Inside run method of :First:74
Inside run method of :Second:75
Inside run method of :First:75
Inside run method of :Second:76
Inside run method of :First:76
Inside run method of :Second:77
Inside run method of :Second:78
Inside run method of :First:77
Inside run method of :First:78
Inside run method of :First:79
Inside run method of :First:80
Inside run method of :Second:79
Inside run method of :Second:80
Inside run method of :Second:81
Inside run method of :Second:82
Inside run method of :Second:83
Inside run method of :Second:84
Inside run method of :Second:85
Inside run method of :First:81
Inside run method of :First:82
Inside run method of :First:83
Inside run method of :First:84
Inside run method of :First:85
Inside run method of :First:86
Inside run method of :First:87
Inside run method of :First:88
Inside run method of :First:89
Inside run method of :First:90
Inside run method of :First:91
Inside run method of :Second:86
Inside run method of :Second:87
Inside run method of :Second:88
Inside run method of :Second:89
Inside run method of :Second:90
Inside run method of :Second:91
Inside run method of :Second:92
Inside run method of :First:92
Inside run method of :Second:93
Inside run method of :First:93
Inside run method of :First:94
Inside run method of :Second:94
Inside run method of :Second:95
Inside run method of :First:95
Inside run method of :Second:96
Inside run method of :First:96
Inside run method of :Second:97
Inside run method of :Second:98
Inside run method of :Second:99
Inside run method of :Second:100
Inside run method of :First:97
Inside run method of :First:98
Inside run method of :First:99
Inside run method of :First:100
*/