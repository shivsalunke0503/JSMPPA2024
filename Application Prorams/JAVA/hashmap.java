import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        //key,value
    HashMap<Integer,String> h = new HashMap<>();
    h.put(101,"shiv");//entryset
    h.put(102,"gautami");
    h.put(103,"gaurav");
    h.put(104,"nikita");
    h.put(102,"xyz");

    System.out.println("name of roll no 103:" + h.get(103));
    System.out.println(h);
    System.out.println("---------------------------------------");
    for(Integer key : h.keySet())
    {
        System.out.println("key is:"+ key +", Value is:"+h.get(key));
    }

    }
    
}
