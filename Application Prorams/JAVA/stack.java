import java.util.Stack;

import javax.swing.plaf.nimbus.State;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(100);
        s.push(30);
        s.push(200); //top
        s.push(40);//top
        System.out.println("removed:"+ s.pop());
        System.out.println("current element at top:"+s.peek());//200
        System.out.println("element from top at location:"+s.search(30));


    }
}
