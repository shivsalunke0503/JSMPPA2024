import java.util.Scanner;
class Arithmetic
{
    int Value1,Value2; //characteristics
    public Arithmetic(int A, int B)
    {
        this.Value1 = A;
        this.Value2 = B;
    }
    
    public int Addition()
    {
        int Result =0;
        Result = this.Value1+this.Value2;
        return Result;
    }
    public int Substraction()
    {
        int Result =0;
        Result = this.Value1-this.Value2;
        return Result;
    }
}

public class OOP {
    public static void main(String[] args) {
        int No1=0, No2=0, Ans=0;
        Scanner scannerObj = new Scanner(System.in); // read from stdin -> keyboard
        System.out.println("enter first number"); //print on stdout -> console
        No1 = scannerObj.nextInt();

        System.out.println("enter second number");
        No2 = scannerObj.nextInt();
        //Classname object name = new Classname();   
        Arithmetic aobj1 = new Arithmetic(No1,No2);

        Ans = aobj1.Addition();
        System.out.println("Addition is "+Ans);

        Ans=aobj1.Substraction();
        System.out.println("Substarction is "+Ans);
        scannerObj.close();
    }
    
}
