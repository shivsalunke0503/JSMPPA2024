#include<iostream>
using namespace std;
class Demo
{
    public:
        int i;
        int j;

    Demo() //default constructor
        {
            cout<<"inside default constructor\n";
        }

    Demo(int A, int B) //11,22 // parameterized constructor
        {
            i=A;
            j=B;
            cout<<"inside parameterized constructor\n";
        }

    Demo(Demo &ref) //Demo &ref = obj2;  // copy constructor
        {
            i = ref.i;
            j=ref.j;
            cout<<"inside copy constructor\n";
        }
    
    ~Demo() // Destructor
        {
            cout<<"inside destructor\n";
        }
};

int main()
{
    Demo obj1;
    Demo obj2 (11,22);
    Demo obj3(obj2);
    return 0;
}