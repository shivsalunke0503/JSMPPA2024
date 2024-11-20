#include<iostream>
using namespace std;

class Demo
{

int i; // default access specifier for i is private
public :
    int j;
private :
    int k;
protected :
    int a;

public :
    Demo()
    {
        i =10;
        j=20;
        k=30;
        a=40;
    }

    void display()
    {
        cout<<"value of i :"<<i<<endl; //allowed
        cout<<"value of j :"<<j<<endl; //allowed
        cout<<"value of k :"<<k<<endl; //allowed
        cout<<"value of a :"<<a<<endl; //allowed
    }
};


int main()
{
    Demo obj;
    // cout<<"value of i :"<<obj.i<<endl; //Not allowed
    cout<<"value of j :"<<obj.j<<endl; //allowed
    // cout<<"value of k :"<<obj.k<<endl; //Not allowed
    // cout<<"value of a :"<<obj.a<<endl; //Not allowed

    obj.display();
    return 0;
}