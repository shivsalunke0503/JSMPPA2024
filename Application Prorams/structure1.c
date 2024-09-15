#include<stdio.h>
struct Demo
{
    int no;
    // float no; //not allowed , compiler will generate ambiguity error
    // int val= 10;  // not allowd to initialize the value at declartion, no memory allocatted  
    float f;
    int x;
    float d;
}strobj,strobj2; // object creation at time of declaration, memory allocated

int main()
{
   struct Demo obj;
   obj.no=10;
   obj.f=10.5f;
   obj.x=20;
   obj.d=20.5;
   printf("sizeof(obj) is = %d \n",sizeof(obj));
   
   struct Demo obj2;
   obj2.no=20;
   obj2.f=20.5f;
   obj2.x=30;
   obj2.d=30.5;
   printf("sizeof(obj2) is = %d \n",sizeof(obj2));
   
   strobj.no =1;
   strobj.f=50.5f;
   strobj.x=100;
   strobj.d=100.5;
   printf("sizeof(strobj) = %d \n",sizeof(strobj));

    struct Demo strobj3 = {2,60.5f,700,700.5}; //initialize with member initialization list

   return 0;
}