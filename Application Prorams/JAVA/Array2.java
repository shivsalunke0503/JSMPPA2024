public class Array2 {
    public static void main(String[] args) {
        int Arr[][] =
        {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        }; // member initialization liust

        int Brr[][]= new int[3][3]; // member by member initialization
        Brr[0][0]=10;
        Brr[0][1]=20;
        Brr[0][2]=30;

        Brr[1][0]=40;
        Brr[1][1]=50;
        Brr[1][2]=60;
        
        Brr[2][0]=70;
        Brr[2][1]=80;
        Brr[2][2]=90;

        System.out.println("Lenght of Brr: "+Brr.length); // 3, brr can store 3 1D arrays in it

        int i=0,j=0;
        for (i=0;i<Brr.length;i++) //outer
        {
            for(j=0;j<Brr[i].length;j++) //inner
            {
                System.out.print(Brr[i][j] +"\t");
            }
            System.out.println();
        }

    }    
}
