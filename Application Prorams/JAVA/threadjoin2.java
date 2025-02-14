public class threadjoin2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread.m1 = Thread.currentThread();
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();
        for(int i =0;i<5;i++)
        {
            System.out.println("main thread");
        }
    }
}

class MyThread extends Thread
{
    static Thread m1;
    public void run()
    {
        for(int i =0;i<5;i++)
        {
            System.out.println("child thread");
            try{
                m1.join();         
            }
            catch(InterruptedException e){}
        }
    }
}