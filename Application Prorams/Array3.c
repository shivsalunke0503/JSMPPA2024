#include<stdio.h>
int main()
{
    //1
    int Arr[5]={10,20,30,40,50}; // declaration and initialization 

    //2
    int Brr[]={10,20,30}; // declare witho length, initialization
        //3
    int Crr[7] = {10,20,30,40}; // declaration , initialization with less members

    //4 member by member initialization
    int Drr[3];
    Drr[0]=10; // member by member initialization
    Drr[1]=20;  // member by member initialization
    Drr[2] =30; // member by member initialization

    const int Err[4] = {1,2,3,4};

    // Err[0]=50; // Not Allowed
    // Err[1]++; //Not Allowed

return 0;
}