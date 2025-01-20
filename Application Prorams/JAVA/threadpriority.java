public class threadpriority {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        
        System.out.println("main thread priority ::"+Thread.currentThread().getPriority());
        System.out.println("m1 priority ::"+m1.getPriority());

        m1.setPriority(10);
        m1.setName("m1");
        m2.setName("m2");
        m2.setPriority(12);// IllegalArgumentException 
        m1.start();
        m2.start();
    }    
}

class MyThread extends Thread {
    public void run()
    {
        System.out.println("current thread is : "+ Thread.currentThread().getName());
    }
}
