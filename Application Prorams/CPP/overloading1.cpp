#include<iostream>
using namespace std;
class Arithmatic
{
public:
    
    int Addition(int no1,int no2)  //Addition@2ii = (originalname @ noofparams initialsalsofparams - name mangling)
    {
        int Ans=0;
        int Result = no1+no2;
        return Result;
    }

    int Addition(int no1,int no2,int no3)   //Addition@3iii
    {
        int Ans=0;
        int Result = no1+no2+no3;
        return Result;
    }

    float Addition(float no1,float no2) //Addition@2ff
    {
        float Ans=0;
        float Result = no1+no2;
        return Result;
    }
};

int main()
{
    Arithmatic obj1; // default contructor invoked internally, no need to declare it in class
    int ans =0;
    ans = obj1.Addition(10,20); // CALL 1000
    cout<<"10+20 = "<<ans<<"\n";

    ans = obj1.Addition(10,20,30);// CALL 2000
    cout<<"10+20+30 = "<<ans<<"\n";

    float ans1 = obj1.Addition(10.5f,20.5f); // CALL 3000
    cout<<"10.5f+20.5f = "<<ans1<<"\n";
    return 0;
}