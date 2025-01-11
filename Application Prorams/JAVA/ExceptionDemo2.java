import java.util.*;
public class ExceptionDemo2 {
    public static void main(String[] args) {
        Scanner scobj = new Scanner(System.in);
                // 0  1  2  3  4
        int Arr[]={10,20,30,40,50};
        System.out.println("please enter the index from where you want to fetch the data");
        int index = scobj.nextInt();
        System.out.println("data at index "+index+" is " + Arr[index]);
    }
}
