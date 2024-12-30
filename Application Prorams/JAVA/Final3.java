class Demo
{
    public void fun(){}
    //can't oveeride final method
    final public void gun()
    {}

    //we can overload final method
    public void gun(int bullet)
    {}
}

class Hello extends Demo{
    public void fun(){}
    public void gun() //can't oveeride final method from Demo
    {}
}

public class Final3 {
public static void main(String[] args) {
    
}

}
