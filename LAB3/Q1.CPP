#include<iostream>
using namespace std;
class Solution{
    float n1;
    float n2;
    public:
  void getData(){
    cout<<"Enter first number: "<<endl;
    cin>>n1;
    cout<<"Enter second number:"<<endl;
    cin>>n2;
  }
  void display(){
    cout<<"The numbers are:"<<endl;
    cout<<n1<<" "<<n2<<endl;
  }
  float getN1(){
    return n1;
  }
  float getN2(){
    return n2;
  }
  void add(Solution s){
    float sum = s.getN1() + s.getN2();
    cout<<"sum is:"<<sum<<endl;
  }
  void sub(Solution &s){
    float sub = s.getN1() - s.getN2();
    cout<<"subtraction is:"<<sub<<endl;
  }
  void mul(Solution *s){
    float mul = s->getN1() * s->getN2();
    cout<<"multiplication is:"<<mul<<endl;
  }
};

int main(){
    Solution s1,s2;
    s2.getData();
    s2.display();
    s1.add(s2);
    s1.sub(s2);
    s1.mul(&s2);
}