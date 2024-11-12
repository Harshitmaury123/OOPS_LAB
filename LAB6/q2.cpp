// Experiment 8: (friend function with inline function, friend function with another class)
// Implement Two Class name is class_2,class_1 define one function name is exchange this function work in 
// both class properties. friend function can be called by reference inthis case copies of the object are not 
// made. Instead a pointer to the address of the object is passed

#include<iostream>
using namespace std;

class class_2;
class class_1{
  int a;
  public:
  void inputA(){
    cout<<"Enter the value of a:"<<endl;
    cin>>a;
  }
  int getA(){
    return a;
  }
  friend void exchange(class_1& c1,class_2& c2);
};
class class_2{
  int b;
  public:
   void inputB(){
    cout<<"Enter the value of b:"<<endl;
    cin>>b;
  }
  int getB(){
    return b;
  }
  friend void exchange(class_1& c1,class_2& c2){
    c1.a=c1.a^c2.b;
    c2.b=c1.a^c2.b;
    c1.a=c1.a^c2.b;
  }
};
int  main(){
  class_1 c1;
  class_2 c2;
  c1.inputA();
  c2.inputB();
  cout<<"Before exchange"<<endl;
  cout<<"class_1 a="<<c1.getA()<<endl;
  cout<<"class_2 b="<<c2.getB()<<endl;
  exchange(c1,c2);
  cout<<"After exchange:"<<endl;
  cout<<"class_1 a="<<c1.getA()<<endl;
  cout<<"class_2 b="<<c2.getB()<<endl;
}
