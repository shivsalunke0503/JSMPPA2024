#include<stdio.h>
int main()
{
    char ch ='A';
    int i =10;
    float f = 10.5f;
    double d = 40.40;

    //specific pointer
    char *cp =&ch;
    int *ip = &i;
    float *fp =&f;
    double *dp =&d;

    printf("%c\n",*cp);//A
    printf("%d\n",*ip);//10
    printf("%f\n",*fp);//10.5
    printf("%f\n",*dp);//40.40

    //generic pointer - sabka malik ek
    void *vp =NULL;
    vp =&ch;
    printf("%c\n",*cp);//A
    printf("%c\n",*(char *)cp);//A // using typecasting

    vp = &i;
    printf("%d\n",*ip);//10
    printf("%d\n",*(int *)ip);//10 using typecasting

    vp=&f;
    printf("%f\n",*fp);//10.5
    printf("%f\n",*(float *)fp);//10.5 using typecasting

    vp = &d;
    printf("%f\n",*dp);//40.40
    printf("%f\n",*(double *)dp);//40.40 using typecasting

return 0;

}