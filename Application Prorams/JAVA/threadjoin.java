public class threadjoin {
    public static void main(String[] args) throws InterruptedException {
        Mythread seeta = new Mythread();
        seeta.start();
        seeta.join(6000);

        for(int i =0;i<5;i++)
        {
            System.out.println("Ram thread");         
        }
    }
}
class Mythread extends Thread {
    public void run()
    {
        for(int i =0;i<5;i++)
        {
            System.out.println("seetha thread");
            
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
        }
    }
}
