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
        cout<<"inside non-static function display()"<<endl;
        cout<<"jamun="<<jamun<<endl;
        cout<<"rasgulla="<<rasgulla<<endl;
        cout<<"lonche="<<lonche<<endl;
        cout<<"---------------------------------"<<endl;
    }

    static void showlonche()
    {
        cout<<"inside staic function showlonche()"<<endl;
        cout<<"lonche="<<lonche<<endl;
        // cout<<"rasgulla"<<rasgulla; // cant access non-static from static
    }
};

int Thali::lonche = 111; // assignment of static variablwe

int main()
{
    //access using classname::staticvariablename
    cout<<"value of lonche:"<<Thali::lonche<<endl; 
    Thali::showlonche();



    Thali thali1;
    thali1.display();
    cout<<"size of any object  ===> "<<sizeof(thali1)<<endl;
    cout<<"value of lonche using object:"<<thali1.lonche<<endl; 
    thali1.showlonche();

    Thali thali2(25);
    thali2.display();

    Thali thali3(25,25);
    thali3.display();

    return 0;
}