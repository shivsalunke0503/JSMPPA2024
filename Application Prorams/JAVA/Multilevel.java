class Base // parent
{
    public int A,B; //characteristics

    public Base()   //default constructor
    {
        System.out.println("Inside Base default constructor");
    }
    public void fun(){System.out.println("Inside base fun"); }

}

class Derived extends Base //derived is child
{
    public int P,Q;     //characteristics
    public Derived()    //default constructor
    {
        System.out.println("Inside Derived default constructor");
    }

    public void gun(){System.out.println("Inside Derived gun"); }
}

class Derived2 extends Derived
{
public int X,Y;
public Derived2(){ System.out.println("Inside Derived2 defaut constructor");}
public void run(){System.out.println("Inside derived2 run");}
}

public class Multilevel {
    public static void main(String[] args) {
        Derived2 dobj = new Derived2(); //no casting
        System.out.println("Value of Base A "+dobj.A);
        System.out.println("Value of Derived P "+dobj.P);
        dobj.fun();
        dobj.gun();
        dobj.run();
    }
}
