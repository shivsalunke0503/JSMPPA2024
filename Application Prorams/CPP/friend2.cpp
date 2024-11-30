#include<iostream>
using namespace std;
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
friend void display();
};

void display() //naked method, outside of class
{
    Demo obj;
    cout<<"value of i ::" <<obj.i <<endl; //Allowed
    cout<<"value of j ::" <<obj.j <<endl; //Allowed because display is friend of Demo class
    cout<<"value of k ::" <<obj.k <<endl; // Allowed because display is friend of Demo class
}

int main()
{
    display();
    return 0;
}