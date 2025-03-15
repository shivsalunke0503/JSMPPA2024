import java.util.*;
class arraylist
{
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList(); //homogeneous
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(10);
        l1.add(null);
        // l1.remove(40);
        System.out.println(l1.contains(20));
        System.out.println(l1);

        System.out.println("--------------------------------------------");
    
        
        List l2 = new ArrayList();//hetero
        l2.add("shiv");
        l2.add(10);
        l2.add(100.256);
        System.out.println(l2);



    }
}