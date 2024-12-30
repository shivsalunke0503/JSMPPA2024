import javax.swing.DefaultListModel;

final class Demo {
    public int A, B;
}

class Hello extends Demo //can't inherit or extend the final class //compile error
{ }

public class Final2 {
public static void main(String[] args) {
    Demo obj1 = new Demo(); // we cancreate object of final class
    
}    
}
