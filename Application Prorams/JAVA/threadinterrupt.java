public class threadinterrupt {
    public static void main(String[] args) {
        MyThread m1= new MyThread();
        m1.start();
        m1.interrupt();
    }
}

class MyThread extends Thread{
    public void run()
    {
        try
        {
            for(int i =0;i<5;i++)
            {
                System.out.println("child thread");
                Thread.sleep(2000);
            }
        }catch(InterruptedException e)
        {
            System.out.println("i got interrupted");
        }
    }
}
