#include<stdio.h>
int main()
{
    char Arr[40];
    printf("Enetr your name");
    scanf("%[^'\n']s",Arr);
    printf("your name is : %s \n",Arr);
    return 0;
}