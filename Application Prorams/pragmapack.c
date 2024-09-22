#include<stdio.h>


struct Demo
{
    int i;
    char ch;
};

#pragma pack(1)
struct Demo2
{
    int i;
    char ch;
};
#pragma pack(pop) //OR
// #pragma pack()


#pragma pack(2)
struct Demo3
{
    int i;
    char ch;
};
#pragma pack()


struct Demo4
{
    int i;
    double d;
}__attribuite__(packed);



