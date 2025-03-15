import java.util.ArrayList;
import java.util.*;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(3);

        Iterator itr = l1.iterator();
        while(itr.hasNext())
        {
            Integer i = (Integer)itr.next();
            if(i%2==0)
            {
                System.out.println(i+" is even number");
            } else{
            System.out.println(i+" is odd number");
            }
        }


    }
}
