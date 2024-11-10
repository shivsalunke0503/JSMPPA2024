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

class JSM : public Hello
{
    public:
        int p;

    JSM()
    {
        cout<<"3. inside JSM constructor" <<endl;
        p=60;
    }

    ~JSM()
    {
        cout<<"3. inside destructor of JSM" <<endl;
    }

    void sun()
    {
        cout<<"inside sun of JSM"<<endl;
    }
};


int main()
{
    JSM jsmobj;

    cout<<sizeof(jsmobj)<<"bytes"<<endl; //24 bytes

    cout<<jsmobj.x <<endl; //10
    cout<<jsmobj.y <<endl; //20
    cout<<jsmobj.a <<endl; //30
    cout<<jsmobj.b <<endl; //40
    cout<<jsmobj.c <<endl; //50
    cout<<jsmobj.p <<endl; //60

    jsmobj.fun();
    jsmobj.gun();
    jsmobj.sun();
    
    return 0;
}