#include<stdio.h>
#include<stdlib.h>
int  main()
{
    int Arr[5];; // static meory allocation //20
    float fValue; // static meory allocation //4
    double Brr[4]; // static meory allocation //32

    int iSize =0;
    int *ptr = NULL;

    printf("Enter the size of an Array:\n "); //6
    scanf("%d",&iSize);

    ptr = (int *)malloc(iSize*sizeof(int)); //24

    ptr[0]=10;
    ptr[1]=20;
    ptr[2]=30;
    printf("ptr->[1]  %d:",ptr[1]);
    free(ptr);
    printf("ptr->[1]  %d:",ptr[1]);
    
    return 0;
}