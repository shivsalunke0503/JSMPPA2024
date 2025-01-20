public class Array3 {
    public static void main(String[] args) {
        int Arr[][]=
        {
            {10,20,30},
            {40,50},
            {60,70,80,90},
            {100,110,120,130,140},
            {150}
        };


        int i=0,j=0;
        for (i=0;i<Arr.length;i++) //outer
        {
            for(j=0;j<Arr[i].length;j++) //inner
            {
                System.out.print(Arr[i][j] +"\t");
            }
            System.out.println();
        }

    }    
}
