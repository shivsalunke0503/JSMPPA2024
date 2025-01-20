#include<stdio.h>
void Fun_Value(int no)
{
    no++;
    printf("value of no inside method %d \n",no); //11
}

void Fun_Address(int *ptr)
{
    (*ptr)++;
     printf("value of *ptr inside method %d \n",(*ptr)); //11
}

void Fun_Reference(int &ref)
{
    ref++;
    printf("value of ref inside method %d \n",ref); //11
}

int main()
{

    int i=10, j=10, k=10;

    printf("-----Call by value-----\n");
    printf("value of i before %d \n",i); //10
    Fun_Value(i);
    printf("value of i after %d \n",i); //10

    printf("-----Call by Address-----\n");
    printf("value of j before %d \n",j); //10
    Fun_Address(&j);
    printf("value of j after %d \n",j); //11
    
    printf("-----Call by Reference-----\n");
    printf("value of k before %d \n",k); //10
    Fun_Reference(k);
    printf("value of k after %d \n",k); //11

    return 0;
}