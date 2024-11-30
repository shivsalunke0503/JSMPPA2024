#include<iostream>
using namespace std;

class Hello
{
    public:
        void display(); // declaration
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
friend void Hello :: display();
};



void Hello::display() //definition 
{
    Demo obj;
    cout<<"value of i ::" <<obj.i <<endl; //Allowed
    cout<<"value of j ::" <<obj.j <<endl; 
    cout<<"value of k ::" <<obj.k <<endl; 
}

int main()
{
    Hello hobj;
    hobj.display();
    return 0;
}