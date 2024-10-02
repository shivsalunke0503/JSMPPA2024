#include<stdio.h>
void Display()
{
    int no=10; //auto int no=10;
    int i; // auto int i;
    auto int j=21;

    printf("%d\n",no);
    printf("%d\n",i);
}
int main()
{
    Display();
    // printf("%d\n",i);
    return 0;
}