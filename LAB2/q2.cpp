#include<iostream>
using namespace std;
class Library{
    public:
   int due(int issueDate,int dueDays){
   int dueDate=(issueDate+dueDays)%30;
     return dueDate; 
    }
};

int main(){
    Library l;
    int month;
    cin>>month;
    int year;
    cin>>year;
    int issueDate;
    int dueDays;
    cout<<"enter the issue date:"<<endl;
    cin>>issueDate;
    cout<<"enter the due days:"<<endl;
    cin>>dueDays;
    int dueDate=l.due(issueDate,dueDays);
    cout<<"due date is:"<<dueDate<<"-"<<month<<"-"<<year<<endl;
}