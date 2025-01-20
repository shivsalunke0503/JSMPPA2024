public class casestudy {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread();
        Thread t2 = new Thread(runnable);

        t1.start();
        // runnable.start();
        t1.run();//
        t2.run();//no thread will becreated
        t2.start();//thread will be created
        runnable.run();//no thread will becreated

    }
}

class MyRunnable implements Runnable
{
    public void run()
    {
        System.out.println("child thread");
    }
}
