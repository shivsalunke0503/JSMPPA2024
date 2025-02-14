public class threadyield {
 public static void main(String[] args) {
    MyThread m1 = new MyThread();
    m1.start();

    for(int i =0;i<5;i++)
    {
        System.out.println("main Thread");
    }
 }   
}


class MyThread extends Thread
{
    public void run()
    {
        for(int i =0;i<5;i++)
        {
            System.out.println("child thread");
            Thread.yield();
        }
    }
}
