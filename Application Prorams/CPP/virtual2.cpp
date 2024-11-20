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
    Parent *parentptr = new Parent; // No casting
    Child *childptr= new Child; // No casting

    Parent *parentptr2 = new Child; // Up Casting

    // Child *childptr2 = new Parent; // Down Casting



    return 0;

 }