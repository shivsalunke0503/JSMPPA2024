class Arithmetic
{
    //Addition2ii
    public int Addition(int A, int B){
        return A+B;
    }

    //Addition3iii
    public int Addition(int A, int B,int C){
        return A+B+C;
    }

    //Addition2dd
    public double Addition(double A, double B){
        return A+B;
    }

    //Addition2id
    public void Addition(int A, double B){System.out.println("inside int double addition");}
    //Addition2di
    public void Addition(double A, int B){System.out.println("inside double int addition");}

}


public class OverloadingX {
    public static void main(String[] args) {
        Arithmetic aobj = new Arithmetic();
        int ires=0;
        double dres =0;

        ires = aobj.Addition(10, 20);
        System.out.println("Addition of two int "+ires);

        ires = aobj.Addition(10, 20,30);
        System.out.println("Addition of three int "+ires);

        dres = aobj.Addition(10.9999, 20.585);
        System.out.println("Addition of two double "+dres);

        aobj.Addition(10,90.99);
        aobj.Addition(90.99, 20);
    }
}
