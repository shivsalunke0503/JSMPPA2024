public class Wrapper {
    public static void main(String[] args) {
        int i =10;
        Integer iobj = i; //Boxing
        System.out.println(i);
        System.out.println(iobj); 
        int no = iobj; //Unboxing
        System.out.println(no);
    }

}
