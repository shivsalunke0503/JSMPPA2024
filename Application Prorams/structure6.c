#include<stdio.h>

//embedded structure nesting
struct outer
{
    int member1;
    struct inner
    {
        int mem1;
    } obj1;
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
    struct outer1 outobj1={10,20};
    printf("outobj1.i = %d \n",outobj1.i);
    printf("outobj1.innerobj.member1 = %d \n",outobj1.innerobj.member1);

return 0;
}

