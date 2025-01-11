import java.util.*;
class ExceptionDemp1
{
public static void main(String x[])
{
    Scanner scannerobje = new Scanner(System.in);
    System.out.println("Enter 1st no");
    int No1 = scannerobje.nextInt();
    System.out.println("Enter 2nd no");
    int No2 = scannerobje.nextInt();

    int iAns = 0;
    iAns = No1/No2;
    System.out.println("Division is :"+ iAns);
    }
}