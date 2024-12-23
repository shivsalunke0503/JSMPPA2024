import java.util.*;
class InputOutput
{
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in); // read from stdin -> keyboard
        System.out.println("enter first number"); //print on stdout -> console
        int No1 = scannerObj.nextInt();

        System.out.println("enter second number");
        int No2 = scannerObj.nextInt();

        int Ans=No1+No2; // actual addition
        System.out.println("Addition is = " +Ans); // + is used concatenate the two things

        System.out.println(1+2+"hi"+10+12); // 3hi1012

        scannerObj.close();

    }
}