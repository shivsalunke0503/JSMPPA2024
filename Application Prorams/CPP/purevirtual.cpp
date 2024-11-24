#include<iostream>
using namespace std;
class Parent
{
public:
    int i,j,k;
    // concrete method // method with body //1000
    void fun() { cout<<"Parent fun()"<<endl; } 
    // concrete method //2000
    virtual void gun()  { cout<<"Parent gun()"<<endl; }
    // method without body
    // pure virtual function in c++
    virtual int Addition(int no1,int no2) = 0; //abstract method 
};

class Child : public Parent {
public:
    int a,b;
    void gun() { cout<<"Child gun()"<<endl; } //4000
    virtual void sun() { cout<<"Child sun()"; } //5000
    int Addition (int no1,int no2) { return no1+no2; } //6000
};

int main()
{
    // Parent pobj;
    Parent *ptr = new Child;
    ptr -> fun();
    ptr -> gun();
    int ret = 0;
    ret = ptr ->Addition(10,20);
    cout<<"Addition is: "<<ret<<endl;
}