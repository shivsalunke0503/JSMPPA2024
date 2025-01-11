import java.util.*;

public class UserDefinedChecked {
public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age:");
            int iAge = sc.nextInt();
            
        try {
            if(iAge<18)
            {
                AgeInavlidException obj = new AgeInavlidException("Your age is less than 18 years");
                throw obj;
                // throw new AgeInavlidException("Your age is less than 18 years");
            }
        }
        catch(AgeInavlidException ex)
            {
                System.out.println(ex);
            }
    }    
}

class AgeInavlidException extends Exception
{
    public AgeInavlidException(String msg)
    {
        super(msg);
    }
}
