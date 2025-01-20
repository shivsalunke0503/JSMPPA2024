public class Multi3 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        // myThread1.start();
        myThread1.run();

        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + "thread");
        }
    }
}


class MyThread extends Thread
{
    public void run()
    {
        for(int i=0; i<5;i++)
        {
            System.out.println("Child thread");
        }
    }
}



