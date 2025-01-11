import java.util.Scanner;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        Demo1 dobj = new Demo1();
    try {
    dobj.Division();    
    }
    catch(Exception ex){
        
    }
    finally{}

class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}

class UserDefined
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int iAge = sobj.nextInt();

        try
        {
            if(iAge < 18)
            {
                AgeInvalid aobj = new AgeInvalid("Your age is below 18");
                throw aobj;
            }
            else
            {
                System.out.println("Login Succesful..");
            }
        }
        catch(AgeInvalid obj)
        {
            System.out.println("Inside catch block");
            System.out.println(obj);
        }
    }
}
    }   
}

class Demo1
{
    public void Division() throws ArithmeticException
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
