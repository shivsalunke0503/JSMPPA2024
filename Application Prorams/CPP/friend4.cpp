#include<iostream>
using namespace std;

class Hello
{
    public:
        void fun();
        void gun();
};


class Demo
{
    public: int i;
    private: int j;
    protected: int k;

    public:
        Demo()
        {
            i=10;
            j=20;
            k=30;
        }
    friend class Hello;
};



void Hello::gun() //definition 
{
    Demo obj;
    cout<<"value of i ::" <<obj.i <<endl; //Allowed
    cout<<"value of j ::" <<obj.j <<endl; 
    cout<<"value of k ::" <<obj.k <<endl; 
}
void Hello::fun() //definition 
{
    Demo obj;
    cout<<"value of i ::" <<obj.i <<endl; //Allowed
    cout<<"value of j ::" <<obj.j <<endl; 
    cout<<"value of k ::" <<obj.k <<endl; 
}

int main()
{
    Hello hobj;
    hobj.fun();
    hobj.gun();
    return 0;
}