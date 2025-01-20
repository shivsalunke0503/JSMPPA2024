public class overloadrun {
public static void main(String[] args) {
    MyThread t1 = new MyThread();
    t1.start();

    t1.run(10);
}    
}


class MyThread extends Thread
{
    public void run() // overriden run() of Thread class
    {
        System.out.println("no argument run()");
    }

    public void run(int i) // overloaded run()
    {
        System.out.println("with argument run()");
    }
}
