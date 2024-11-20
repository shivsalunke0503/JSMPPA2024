#include<iostream>
using namespace std;
 
 class Parent 
 {
    public: 
        int i,j,k;
    
    virtual void  fun() //1000
    {
        cout<<"inside Parent fun"<<endl;
    }

     virtual void gun() //definition //2000
    {
        cout<<"inside Parent gun"<<endl;
    }

    void sun() //3000
    {
        cout<<"inside Parent sun"<<endl;
    }

     void run() //definition //4000
    {
        cout<<"inside Parent run"<<endl;
    }

 };


 class Child : public Parent 
 {
    public:
        int a,b;
    
    virtual void gun() // redefinition //5000
    {
        cout<<"inside child gun"<<endl;
    }

    void run() //redefinition //6000
    {
        cout<<"inside child run"<<endl;
    }

   virtual void mun() //7000
    {
    cout<<"inside child mun"<<endl;
    }
 };


 int main()
 {
    cout<<"size of Parent"<<sizeof(Parent)<<endl; //12 + 4()
    cout<<"size of Child"<<sizeof(Child)<<endl; //20 + 4()

    Parent *ptr = new Child; //up-casting
    ptr->fun();
    ptr->gun();
    ptr->sun();
    ptr->run();
    // ptr->mun();
     
     return 0;

 }