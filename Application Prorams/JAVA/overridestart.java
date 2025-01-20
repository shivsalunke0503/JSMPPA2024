public class overridestart {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

class MyThread extends Thread
{
    public void start()
    {
        System.out.println("start method");
    }

    public void run()
    {
        System.out.println("run method");
    }
}
