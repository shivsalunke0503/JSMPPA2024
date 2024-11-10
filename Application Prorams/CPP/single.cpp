#include<iostream>
using namespace std;
class Demo //Parent class
{
    public:
        int x,y;

        Demo()
        {
            cout<<"1. Inside Demo constructor"<<endl;
            x=10;
            y=20;
        }

        ~Demo()
        {
            cout<<"1. Inside Demo destructor"<<endl;
        }

        void fun()
        {
            cout<<"Inside fun of Demo"<<endl;
        }
};

//child class:Hello
//class Hello extends Demo --java syntax
class Hello : public Demo
{
    public:
        int a,b,c;
    
    Hello()
    {
        cout<<"2. Inside Hello constructor"<<endl;
        a=30;
        b=40;
        c=50; 
    }

    ~Hello()
    {
        cout<<"2. Inside Hello destructor"<<endl;
    }

    void gun()
    {
        cout<<"Inside gun of Hello"<<endl;
    }
};

int main()
{
    Hello hobj;

    cout<<sizeof(hobj)<<"bytes"<<endl; //20 bytes

    cout<<hobj.x <<endl; //10
    cout<<hobj.y <<endl; //20
    cout<<hobj.a <<endl; //30
    cout<<hobj.b <<endl; //40
    cout<<hobj.c <<endl; //50

    hobj.fun();
    hobj.gun();
    
    return 0;
}