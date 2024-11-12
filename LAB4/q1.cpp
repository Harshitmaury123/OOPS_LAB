// An employer plane to pay a bonus to employees. A bonus of 10% is to be paid to employees with earning 
// at least Rs. 2000/- of the earning to others. The input contains name and earning of an employee and the 
// desired output is name and bonus to be paid to the employee.
// Create a class to represent an employee. It should incluse the following:
//  Data Members:
//  Name
//  Earning
//  Bonus
//  Member Functions:
//  To input data
//  To compute bonus
//  To output the desired information
// Using this class, write a program to accomplish the intended task

#include<iostream>
using namespace std;

class Employee{
    string name;
    double earning;
    double bonus;
    public:
    void inputData(){
        cout<<"Enter the name of employeee:"<<endl;
        cin>>name;
        cout<<"Enter your earnings:"<<endl;
        cin>>earning;
    }
    void computeBonus(){
        bonus=earning*0.1;
    }
    void output(){
        if(earning>=2000){
        cout<<"Your bonus is"<<" "<<bonus<<endl;
        cout<<"Thank you"<<endl;
        }
        else{
            bonus=0;
            cout<<"No bonus is paid to you"<<endl;
        }
    }
};
int main(){
    Employee e1;
    e1.inputData();
    e1.computeBonus();
    e1.output();
}


