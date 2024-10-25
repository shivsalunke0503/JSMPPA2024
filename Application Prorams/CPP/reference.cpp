#include<iostream>
using namespace std;
int main()
{
    int no =11;
    int &noref=no;

    int rahul = 99;
    int &pappu = rahul;

    int *ptr=&no;
    int *(&ptrRef) = ptr;

    cout<<"no::"<<no<<"\n"; //11
    cout<<"noref::"<<noref<<"\n"; //11

    cout<<"&no::"<<&no<<"\n"; //100
    cout<<"&noref::"<<&noref<<"\n"; //100

    cout<<"*ptr::"<<*ptr<<"\n";//11
    cout<<"*ptrRef::"<<*ptrRef<<"\n";//11

    no++;
    cout<<"after no++::";
    cout<<"no::"<<no<<"\n"; //12
    cout<<"noref::"<<noref<<"\n"; //12

    noref++;
    cout<<"after noref++::\n";
    cout<<"no::"<<no<<"\n"; //13
    cout<<"noref::"<<noref<<"\n"; //13

return 0;
}