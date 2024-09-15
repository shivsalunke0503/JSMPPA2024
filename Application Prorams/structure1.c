#include<stdio.h>
struct Demo
{
    int no;
    float f;
    int x;
    float d;
};

int main()
{
   struct Demo obj;
   obj.no=10;
   obj.f=10.5f;
   obj.x=20;
   obj.d=20.5;
   printf("sizeof(Demo) structure is = %d \n",sizeof(obj));
   
   struct Demo obj2;
   obj2.no=20;
   obj2.f=20.5f;
   obj2.x=30;
   obj2.d=30.5;
   printf("sizeof(Demo) structure is = %d \n",sizeof(obj2));
   return 0;
}