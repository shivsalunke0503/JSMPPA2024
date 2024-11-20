#include<iostream>
using namespace std;

class Demo
{
    public:
        int i,j,k;
    
    Demo()
    {
        cout<<"inside constructor"<<endl;
    }

    ~Demo()
    {
        cout<<"inside destructor"<<endl;
    }

    void display()
    {
        cout<<"inside display"<<endl;
    }
};

int main()
{
    Demo obj; // static memory allocation for object
    obj.display();

    
    Demo *ptr= new Demo; // dynamically memory allocated for object 
    // Demo *ptr = (Demo *)malloc(sizeof(Demo));
    ptr->i=10;
    ptr->display();

    delete ptr; 
    // free(ptr);
    return 0;

}
