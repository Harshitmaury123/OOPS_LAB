// Experiment 4. Create a class to represent a bank account. It should include the following:
//  Data Members:
//  Name of account holder
//  Account number
//  Type of account
//  Balance amount
//  Member Function:
//  To initialize the data members with appropriate data
//  To deposit an amount
// To withdraw an amount after checking the balance
// To display details of account holder
// Write a program to use this class.

#include<iostream>
using namespace std;
class BankAccount{
    private:
    string name;
    int accountNumber;
    string accountType;
    float balance;
    public:
    void input(){
        cout<<"Enter the name:"<<endl;
        cin>>name;
        cout<<"Enter the account number:"<<endl;
        cin>>accountNumber;
        cout<<"Enter the account type :"<<endl;
        cin>>accountType;
        cout<<"Enter the balance:"<<endl;
        cin>>balance;
    }
    void deposit(){
        float amount;
        cout<<"Enter the amount to deposit:"<<endl;
        cin>>amount;
        balance+=amount;
        cout<<"Balance after deposit: "<<balance<<endl;
    }
    void withdraw(){
        float amountw;
        cout<<"Enter the amount to withdraw:"<<endl;
        cin>>amountw;
        if(amountw>balance){
        cout<<"Insufficient balance"<<endl;
        cout<<"Your balance is: "<<balance<<endl;
        }
        else
        {
            balance-=amountw;
            cout<<"Balance after withdrawal: "<<balance<<endl;
        }
    }
    void display(){
        cout<<"Name: "<<name<<endl;
        cout<<"Account number: "<<accountNumber<<endl;
        cout<<"Accout Type: "<<accountType<<endl;
        cout<<"Current Balance: "<<balance<<endl;        
    }
};
int main(){
  BankAccount b;
  b.input();
  b.deposit();
  b.withdraw();
  b.display();
}