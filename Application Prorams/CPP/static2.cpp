#include<iostream>
using namespace std;
class Thali
{
    public:
        int jamun;
        int rasgulla;
        static int lonche;
    // parameterized constructor with default arguments
    Thali(int jam=10,int ras=5) 
    {
        jamun = jam;
        rasgulla =ras;
    }

    void display()
    {
        cout<<"jamun="<<jamun<<endl;
        cout<<"rasgulla="<<rasgulla<<endl;
        cout<<"---------------------------------"<<endl;
    }
};

int Thali::lonche = 111; // assignment of static variablwe

int main()
{
    //access using classname::staticvariablename
    cout<<"value of lonche:"<<Thali::lonche<<endl; 

    Thali thali1;
    thali1.display();
    cout<<"size of any object  ===> "<<sizeof(thali1)<<endl;
    cout<<"value of lonche using object:"<<thali1.lonche<<endl; 

    Thali thali2(25);
    thali2.display();

    Thali thali3(25,25);
    thali3.display();

    return 0;
}