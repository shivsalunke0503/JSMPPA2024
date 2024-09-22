#include<stdio.h>
struct Demo
{
    int no;
    struct Demo *ptr;
};

int main()
{
    struct Demo obj1,obj2,obj3;
    obj1.no=10;
    obj2.no=20;
    obj3.no=30;

    obj1.ptr = &obj2;
    obj2.ptr = &obj3;
    obj3.ptr=NULL;
    

    printf("obj1.ptr->no = %d\n",obj1.ptr->no);
    printf("obj1.ptr->ptr->no = %d\n",obj1.ptr->ptr->no);
    //uncomment below lines to see circulat linked list
    // obj3.ptr=&obj1;
    // printf("obj1.ptr->ptr->no = %d\n",obj1.ptr->ptr->ptr->no);
    return 0;
}