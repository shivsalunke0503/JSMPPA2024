abstract class Demo //RBI
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

class Hello extends Demo // SBI extends RBI
{
   public Hello() { System.out.println("Hello constructor");}
   
   //implemented the abstract method of parent class Demo.
   public void fun()
   {
    System.out.println("Hello fun");
   }
}

public class AbstractDemo1 {
    public static void main(String[] args) {
        Hello hobj = new Hello();
        hobj.fun();
        hobj.gun();
    // Demo obj1 = new Demo(); //cant instantiate / create object of abstract class.    
    }
    
}
