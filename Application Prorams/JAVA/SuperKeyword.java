public class SuperKeyword {
public static void main(String[] args) {
    Child child1 = new Child();
    child1.show();
    Child child2 = new Child(50);
    child2.show();
}    
}

class Parent {
    int A;
    Parent()
    {
        System.out.println("inside parent default constructor");
    }
    Parent(int x)
    {
        this.A = x;
        System.out.println("inside parent paremeterized constructor");
    }
    void display()
    {
        System.out.println("inside parent display()");
    }
}

class Child extends Parent
{
    int B;
    Child()
    {
        super();
        System.out.println("inside Child default constructor");
    }
    Child(int y)
    {
        super(10);
        this.B = y;
        System.out.println("inside Child paremeterized constructor");
    }
    void show()
    {
        System.out.println("i am in show");
        System.out.println("parent.A = "+ super.A);
        super.display();
    }
}