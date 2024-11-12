#include<iostream>
#include<unordered_map>
using namespace std;
class Topper{
    public:
    string name;
    int marks;
  void getData(){
    cout<<"Enter the name of student:"<<endl;
    cin>>name;
    cout<<"Enter the marks of student:"<<endl;
    cin>>marks;
  }
};

int main(){
    int n;
    cin>>n;
    Topper students[n];
    for(int i=0;i<n;i++){
        students[i].getData();
    }
    int topperIndex=0;
    for(int i=1;i<n;i++){
        if(students[i].marks>students[topperIndex].marks){
            topperIndex=i;
        }
    }
    cout<<"The topper is:"<<students[topperIndex].name<<endl; 
}