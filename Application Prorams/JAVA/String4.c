#include<stdio.h>
int calculateLength(char *str)
{
    int iCnt =0;
    while(*str != '\0')
    {
        iCnt++;
        str++;
    }
    return iCnt;
}

int main()
{
    char name[40];
    int iRet = 0;

    printf("Enter your name");
    scanf("%[^'\n']s",name);

    iRet = calculateLength(name);
    printf("Length of your name is %d",iRet);
    return 0;
}