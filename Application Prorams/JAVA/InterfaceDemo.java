interface Maths
{
    //by default every method in interface is public,abstract
    public int Addition(int A, int B); 
    public int Substraction(int A, int B);
}

class Tenth implements Maths
{
public int Addition(int A, int B)
{
    return A+B;
}

public int Substraction(int A, int B)
{
    return A-B;
}
} 

public class InterfaceDemo {
    public static void main(String[] args) {
        Tenth obj = new Tenth();
        int iRes=0;
        iRes = obj.Addition(10, 20);
        System.out.println("Addition is : " + iRes);
        iRes = obj.Substraction(20, 10);
        System.out.println("Substraction is : " + iRes);
    }
}
