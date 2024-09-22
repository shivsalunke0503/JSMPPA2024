#include<stdio.h>

//embedded structure nesting
struct outer
{
    int member1;
    struct inner
    {
        int no;
    }innerObj1;
};


//separate structure nesting
struct inner1{
int member1;
};

struct outer1 
{
int i;
struct inner1 innerobj;
};

int main()
{
    //separate nesting
    struct outer1 outobj1={10,20};
    printf("outobj1.i = %d \n",outobj1.i);
    printf("outobj1.innerobj.member1 = %d \n",outobj1.innerobj.member1);

    //embedded nesting
    struct outer outerobj1 = {30,40};
    // struct inner innerObj1 = {60};
    printf("outerobj1.member1: %d \n",outerobj1.member1);
    printf("outerobj1.obj1.no: %d \n",outerobj1.innerObj1.no);
    // printf("innerObj1.no %d \n",innerObj1.no);
return 0;
}

