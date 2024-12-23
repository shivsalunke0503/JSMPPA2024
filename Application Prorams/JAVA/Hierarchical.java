class Base // parent
{
    public int A,B; //characteristics

    public Base()   //default constructor
    {
        System.out.println("Inside Base default constructor");
    }
    public void fun(){System.out.println("Inside base fun"); }

}

class Derived extends Base //child1 of Base
{
    public int P,Q;     //characteristics
    public Derived()    //default constructor
    {
        System.out.println("Inside Derived default constructor");
    }

    public void gun(){System.out.println("Inside Derived gun"); }
}

class Derived2 extends Base // child2 of Base
{
public int X,Y;
public Derived2(){ System.out.println("Inside Derived2 defaut constructor");}
public void run(){System.out.println("Inside derived2 run");}
}

public class Hierarchical {
    public static void main(String[] args) {
        Derived dobj1 = new Derived();        
        Derived2 der2obj = new Derived2(); //no casting
        System.out.println("Value of Base A "+dobj1.A);
        System.out.println("Value of Derived P "+dobj1.P);
        dobj1.fun();
        dobj1.gun();
        der2obj.fun();
        der2obj.run();
    }
}
