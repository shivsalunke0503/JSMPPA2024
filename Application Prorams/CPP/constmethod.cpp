#include<iostream>
using namespace std;
class Demo 
{
    public: int i,j,k; //characteristics

    Demo(int a, int b,int c)
    {
        i=a;
        j=b;
        k=c;
    }
    //behaviours
    void fun(){i++; j++; k++;}
    void gun(int x, const int y) const
    {
        int no1 =10;
        const int no2 =20;
        x++;    //Allowed
        y++;    // Not Allowed
        no1++;  //Allowed
        no2++;  //Not Allowed
        i++;    //Allowed
        j++;    //Allowed
        k++;    //Allowed
     }
};

int main()
{
    Demo obj(10,20,30);
    obj.fun();
    obj.gun(40,50);

    const Demo obj2(100,200,300);
    obj2.fun(); // noty allowed because constant object can call only constant methods
    obj2.gun(60,70); // Aloowed

}