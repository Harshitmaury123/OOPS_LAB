// Experiment 6: Write a program to find mean of two numbers belonging to two different classes using 
// friend function.

#include<iostream>
using namespace std;

class A{
    public:
    int a;
    void getInput(){
        cout<<"Enter the number: "<<endl;
        cin>>a;
    }
};
class B:public A{
    int b;
    public:
    void getInput(){
        cout<<"Enter the number: "<<endl;
        cin>>b;
    }
    friend void mean(A &a1,B &b1);
};
inline void mean(A &a1,B &b1){
    cout<<"mean is:"<<(a1.a+b1.b)/2<<endl;
}

int main(){
    A a1;
    B b1;
    a1.getInput();
    b1.getInput();
    mean(a1,b1);
}