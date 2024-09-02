#include<stdio.h>
int main()
{
    char ch ='A';
    int i =10;
    float f = 30.4f;
    double d = 90.12345;

    char *chpointer= &ch;
    printf("Address of ch = %u \n",&ch);
    printf("chpointer holds the address of ch and address is %u \n",chpointer);
    printf("chpointer fetch the value from addrss which is stored in it %c \n",*chpointer);
    
    int *iPointer = &i;
    float *fPointer = &f;
    double *dPointer= &d;
    printf("the size of iPonter is %d \n",sizeof(*iPointer));
   
    return 0;
}