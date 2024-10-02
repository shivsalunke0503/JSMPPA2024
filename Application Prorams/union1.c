#include<stdio.h>
union Demo
{
    int i;
    char ch;
    float f;
    double d;
};

int main()
{
    union Demo obj1;
    printf("size of Demo union object = %d\n",sizeof(obj1));
    
    obj1.ch ='A';
    printf("ch = %c\n",obj1.ch); //A

    obj1.i =10;
    printf("i = %d\n",obj1.i); //10

    printf("ch = %c\n",obj1.ch);//blank


    return 0;
}