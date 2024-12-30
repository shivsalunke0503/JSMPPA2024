abstract class Demo
{
    public int A,B;

    public Demo()
    {
        System.out.println("Indside Demo constructor");
        this.A=0;
        this.B=0;
    }
    
    //methout without body
    //virtual void fun()=0; ---c++ syantax
    abstract void fun();

    //cocrete method - meethod with body
    void gun()
    {
        System.out.println("inside Demo gun");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
    // Demo obj1 = new Demo(); //cant instantiate / create object of abstract class.    
    }
    
}
