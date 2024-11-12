#include<iostream>
#include<algorithm>
#include<bits/stdc++.h>
using namespace std;

class Dynamic{
    private:
    int size;
    int *arr;
    public:
   Dynamic(){
     cout<<"Default constructor"<<endl;
   }
   Dynamic(int size){
     this->size=size;
     arr =new int[size];
   }
   void getValues(){
    for(int i=0;i<size;i++){
        cin>>arr[i];
    }
   }
   void display(){
    int maxi=-1000;
    for(int i=0;i<size;i++){
    if(arr[i]>maxi){
        maxi=arr[i];
    }
    }
     cout<<"maximum of elements is:"<<maxi<<endl;
   }
};

int main(){
    int size;
    cout<<"enter the size of array:"<<endl;
    cin>>size;
    Dynamic d(size);
    d.getValues();
    d.display();
}