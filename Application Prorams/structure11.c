#include<stdio.h>
struct Hello
{
    int no;
    float f;
};

struct Demo
{
    int i;
    float d;
    struct Hello hobj1;
    struct Hello hobj2;
}dobj;

int main()
{
    printf("size of Demo obj = %d \n",sizeof(dobj));
    return 0;
}

