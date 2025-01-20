public class threadnames {
   public static void main(String[] args) {
    System.out.println("current thread is "+ Thread.currentThread().getName());
    MyThread m1 = new MyThread();
    System.out.println(m1.getName());
    MyThread m2 = new MyThread();
    System.out.println(m2.getName());
    m1.setName("thread1");
    m2.setName("thread2");
    Thread.currentThread().setName("JSM"); // main - JSM

    System.out.println(m1.getName());
    System.out.println(m2.getName());
    System.out.println("current thread is "+ Thread.currentThread().getName());
   } 
}

class MyThread extends Thread
{
    
}
