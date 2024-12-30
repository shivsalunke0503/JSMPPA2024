interface Circle
{
    public float PI = 3.14f;
    public float Area(float radius);
    public float circumferance(float radius);
}

class Shapes implements Circle
{
    public float Area(float radius){
        return PI*radius*radius;
    }

    public float circumferance(float r) {
        return 2*PI*r;
    }
}

public class InterfaceDemo1 {
    public static void main(String[] args) {
        Shapes obj1 = new Shapes();
        System.out.println("value of pi : " +Circle.PI); //can access PI as it is public static
        //Circle.PI = 10.5f; //cant reassign final variable
        float fRes=0.0f;
        fRes = obj1.Area(5);
        System.out.println("Area is : " +fRes+"sqme" );
        fRes = obj1.circumferance(10);
        System.out.println("Circumferrance is ="+ fRes +"m");
    }
}
