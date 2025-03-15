import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("sss");
        hs.add("aa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        System.out.println(hs.add("bbb"));
        hs.add(null);
        System.out.println(hs);



    }
}
