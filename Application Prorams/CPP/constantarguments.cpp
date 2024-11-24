#include<iostream>
using namespace std;

void display(int i, const int j)
{
int a =10;
const int b =20;

i++; //Allowed
// j++; // Not allowed
a++; //allowed
// b++; // not allowed
}

int main()
{
    display(1,2);
    return 0;
}