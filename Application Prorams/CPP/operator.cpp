#include<iostream>
using namespace std;
class Demo
{
    public: int i,j;

    Demo(int a=10, int b=20)
    {
        i=a;
        j=b;
    }
};

int main()
{
    Demo obj1(10,20);
    Demo obj2(30,40);
    Demo obj3(0,0);

    obj3 = obj1 + obj2; // compile time error
}