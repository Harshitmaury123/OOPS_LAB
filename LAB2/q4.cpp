#include<iostream>
using namespace std;
class Student{
 private:
  int admno;
  string name;
  float marksEng;
  float marksMaths;
  float marksSci;
  float total;
  float compute(){
   total=marksEng+marksMaths+marksSci;
   return total;
  }
  public:
  void readData();
  void showData();
};

void Student::readData(){
    cout<<"admission no."<<endl;
    cin>>admno;
    cout<<"enter name:"<<endl;
    cin>>name;
    cout<<"enter marks of english:"<<endl;
    cin>>marksEng;
    cout<<"enter marks of maths:"<<endl;
    cin>>marksMaths;
    cout<<"enter marks of science:"<<endl;
    cin>>marksSci;
    total=compute();
    cout<<"total:"<<total<<endl;
}

void Student::showData(){
    cout<<"admission no."<<admno<<endl;
    cout<<"name:"<<name<<endl;
    cout<<"marks of english:"<<marksEng<<endl;
     cout<<"marks of maths:"<<marksMaths<<endl;
    cout<<"marks of Science:"<<marksSci<<endl;
    total=compute();
    cout<<"total:"<<total<<endl;
}

int main(){
  Student s1;
  s1.readData();
  s1.showData();
  return 0;
}