import java.util.Enumeration;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.addElement(20);;
        v.addFirst(30);
        System.out.println(v);

        Enumeration e = v.elements();

        while(e.hasMoreElements()){
            Integer i = (Integer)e.nextElement();
            System.out.println(i);
        }
    }
}
