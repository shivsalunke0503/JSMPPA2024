#include<stdio.h>
struct Demo
{
    int i;
    char ch;
    //after removing the comments the size will be same i.e 24 bytes
    // char ch1;
    // char ch2;
    // char ch3;

    float f;
    // int in;
    double d;
};

int main()
{
    struct Demo obj1;
    printf("size of Demo structures object = %d\n",sizeof(obj1));
    return 0;
}