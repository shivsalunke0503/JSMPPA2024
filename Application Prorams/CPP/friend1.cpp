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
};

void display() //naked method, outside of class
{
    Demo obj;
    cout<<"value of i ::" <<obj.i <<endl; //Allowed
    cout<<"value of j ::" <<obj.j <<endl; //NA
    cout<<"value of k ::" <<obj.k <<endl; //NA
}

int main()
{
    display();
    return 0;
}

