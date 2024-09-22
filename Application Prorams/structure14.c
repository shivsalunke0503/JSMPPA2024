#include<stdio.h>
#pragma pack(1)

struct Demo
{
    double d;
    int i;
    char ch;
    char ch1;
    float f;
    
};

int main()
{
    struct Demo obj1;
    printf("size of Demo structures object = %d\n",sizeof(obj1));
    return 0;
}