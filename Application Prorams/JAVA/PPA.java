interface Circle
{
    public float PI = 3.14f;
    public float Area(float radius);
    public float circumferance(float radius);
}

public class PPA implements Circle
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
        PPA obj1 = new PPA();
        System.out.println("value of pi : " +Circle.PI);
    }
}
