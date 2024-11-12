#include<iostream>
using namespace std;
class Bank{
   private:
      long long accountNo;
      double currBalance;
      string name;
      string password;
      public:
      void getAccdetails(){
        cout<<"enter the account number:"<<endl;
        cin>>accountNo;
        cout<<"enter the name:"<<endl;
        cin>>name;
        cout<<"enter the current balance:"<<endl;
        cin>>currBalance;
        cout<<"enter the password:"<<endl;
        cin>>password;
      }
       void display(){
        cout<<"Your account no."<<accountNo<<endl;
        cout<<"Your current Balance is:"<<currBalance<<endl;
      }
      void withdraw(){
        double towithdraw;
        string check;
        cout<<"enter the amount of money you want to withdraw:"<<endl;
        cin>>towithdraw;
        cout<<"Enter your 4 digit PIN:"<<endl;
        cin>>check;
        if(check==password){
        currBalance-=towithdraw;
        }
         else{
            cout<<"Wrong password"<<endl;
         }
      }
      void deposit(){
        double deposit;
        string check;
        cout<<"enter the amount of money you want to deposit:"<<endl;
        cin>>deposit;
         cout<<"Enter your 4 digit PIN:"<<endl;
         cin>>check;
         if(check==password){
         currBalance+=deposit;
         }
         else{
            cout<<"Wrong password"<<endl;
         }
      }
};

int main(){
    Bank b;
    b.getAccdetails();
    b.withdraw();
    b.deposit();
    b.display();
}