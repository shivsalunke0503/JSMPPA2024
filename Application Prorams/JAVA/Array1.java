
public class Array1 {
public static void main(String[] args) {
    //          0  1  2  3  4
    int Arr[]={10,20,30,40,50}; // member initializatin=on list

    int Arr2[] = new int [5]; // member by member initialization
    Arr[0] = 10;
    Arr[1] = 20;
    Arr[2] = 30;
    Arr[3] = 40;
    Arr[4] = 50;

    System.out.println("Length of Arr1 : "+ Arr.length);

    int iCnt =0;
    for(iCnt=0; iCnt<Arr.length; iCnt++)
    {
        System.out.println(Arr[iCnt]);
    }
}    
}
