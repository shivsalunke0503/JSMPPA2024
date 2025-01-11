import java.util.Scanner;

public class ExceptionDemo1X {
    public static void main(String[] args) {

    Scanner scannerobje = new Scanner(System.in);
    System.out.println("Enter 1st no");
    int No1 = scannerobje.nextInt();
    System.out.println("Enter 2nd no");
    int No2 = scannerobje.nextInt();

    int iAns = 0;
    try
    {
        System.out.println("inside try block");
        iAns = No1/No2;
        System.out.println("Division is :"+ iAns);
    }
    catch(ArithmeticException ex){
        System.out.println("inside catch block");
        System.out.println(ex);
    }
    catch(ArrayIndexOutOfBoundsException ex)
    {
        System.out.println("array index out of boud "+ex);
    }
    catch(Exception ex) // MS Dhoni
    {
        System.out.println("all exception handling"+ex);
    }

    finally
        {
            System.out.println("inside finally block, dont care if there is an exception or not, i will execute");
        }
    }
}
