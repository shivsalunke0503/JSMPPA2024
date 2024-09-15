#include<stdio.h>
int main()
{
    int Arr[5]={10,20,30,40,50};
    int *ptr = Arr;
    int *ptr2= &(Arr[4]);

    int Ans=0;
    //Addition of PTR+No
    printf("ptr before addition = %u \n",ptr); //64222272
    ptr = ptr+2; // ptr+2(sizeof(int)) i.e //64222272+2(4) = //64222272+8 =//64222280
    printf("ptr after addition = %u \n",ptr);//64222280
 //Addition of PTR+PTR : not allowed

    //Substraction of No from PTR (PTR-NO)
    printf("ptr before substraction = %u \n",ptr);//64222280
    ptr = ptr-1;
    printf("ptr after substraction = %u \n",ptr);//64222276

    //Substraction two Pointers
    printf("ptr before substraction = %u \n",ptr);//64222276
    printf("ptr2 before substraction = %u \n",ptr2);//64222288
    Ans = (ptr2-ptr);
    printf("ptr2-ptr substraction = %d \n",Ans);//3
    return 0;
}