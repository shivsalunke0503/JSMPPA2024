#include<iostream>
using namespace std;
 
 class Parent 
 {
    public: 
        int i,j,k;
    
    void fun()
    {
        cout<<"inside Parent fun"<<endl;
    }
 };


 class Child : public Parent 
 {
    public:
        int a,b;
    
    void gun()
    {
        cout<<"inside child gun"<<endl;
    }    
 };


 int main()
 {
    Parent parentobj; //12 byte
    Child childobj; //20 byte

    cout<<"size of parent obj"<<sizeof(parentobj);
    cout<<"size of child obj"<<sizeof(childobj);

    parentobj.fun();
    childobj.fun();
    childobj.gun();

    return 0;

 }