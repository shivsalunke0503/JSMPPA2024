class restartthread {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        m1.start(); // first time started

        System.out.println("main thread running");
        System.out.println("main thread running");
        System.out.println("main thread running");
        m1.start(); // second time started
    }
    
}
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("child running");
    }
}
