import JSM.*;
import JSM.Infotech.*;

public class PackageDemo {
    public static void main(String[] args) {
        Maths1 obj = new Maths1();
        int iRes = obj.Additin(10, 20);
        System.out.println("Result is" + iRes);

        ArithmeticPackage a1 = new ArithmeticPackage();
        iRes = a1.Substraction(10, 5);
        System.out.println("substraction is "+ iRes);
    }    
}
