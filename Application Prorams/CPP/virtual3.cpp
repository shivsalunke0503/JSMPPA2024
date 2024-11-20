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

     void gun() //definition
    {
        cout<<"inside Parent gun"<<endl;
    }

    void sun()
    {
        cout<<"inside Parent sun"<<endl;
    }

     void run() //definition
    {
        cout<<"inside Parent run"<<endl;
    }

 };


 class Child : public Parent 
 {
    public:
        int a,b;
    
    void gun() // redefinition
    {
        cout<<"inside child gun"<<endl;
    }

    void run() //redefinition
    {
        cout<<"inside child run"<<endl;
    }
 };


 int main()
 {

    Parent *ptr = new Child; //up-casting
    ptr->fun();
    ptr->gun();
    ptr->sun();
    ptr->run();
     
     return 0;

 }