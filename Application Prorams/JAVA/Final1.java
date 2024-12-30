class Demo
{
    public int A;
    public final int B; // const in c++, constatnt
Demo()
{
    A=10;
    B=20;
}

Demo(int i,int j)
{
    A=i;
    B=j;
}
}


public class Final1 {
    public static void main(String[] args) {
        Demo dobj = new Demo();
        System.out.println("Value of A:"+dobj.A); //10
        System.out.println("Value of B:"+dobj.B); //20

        dobj.A++; // 11
        //dobj.B++; // compile time error bcoz it is final

        Demo obj2 = new Demo(30,40);
        System.out.println("Value of A:"+obj2.A); //30
        System.out.println("Value of B:"+obj2.B); //40
        
    }

    
}
