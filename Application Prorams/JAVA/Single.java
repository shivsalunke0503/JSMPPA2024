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

public class Single {
    public static void main(String[] args) {
        Derived dobj = new Derived(); //no casting
        System.out.println("Value of Base A "+dobj.A);
        dobj.fun();
        dobj.gun();
    }
}
