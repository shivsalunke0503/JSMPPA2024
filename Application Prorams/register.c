#include<stdio.h>
void Display()
{
    int no=10; //auto int no=10;
    register int i = 1760;

    printf("%d\n",no);
    printf("%d\n",i);
}
int main()
{
    Display();
    // printf("%d\n",i);
    return 0;
}