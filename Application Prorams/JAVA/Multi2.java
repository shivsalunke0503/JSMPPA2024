public class Multi2 {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();

        MyRunnable myRunnable2 = new MyRunnable();
        Thread t2 = new Thread(myRunnable2);
        t2.start();

    }
}

class MyRunnable implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running:: "+Thread.currentThread().getName());
    }
}