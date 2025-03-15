import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(100);
        s.add(50);
        s.add(40);
        s.add(10);
        s.add(200);
        System.out.println(s);

        TreeSet<String> t = new TreeSet<>();
        t.add("shiv");
        t.add("vaishnavi");
        t.add("nikita");
        t.add("gautami");
        t.add("gaurav");
        System.out.println(t);

    }
}
