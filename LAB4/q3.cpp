// Experiment 3. Income tax for individuals is computed on slab rates as follows:
// Income Tax Payable
// Upto Rs. 1,00,000/- Nill
// From Rs. 1,00,001/- to Rs. 1,50,000/- 10% of the excess over Rs. 1,00,000/-
// From Rs. 1,51,001/- to Rs. 200,000/- 20% of the excess over Rs. 1,50,000/-
// Above Rs. 2,00,000/- 30% of the excess over Rs. 2,00,000/-
// The input contains name of the individual and income and the desired output is the name of the 
// individual and amount of tax to be paid by the individual.
// Create a class to represent an employee. It include the following:
//  Data Members:
//  Name
//  Income
//  Tax due
//  Member Functions:
//  To input data
//  To compute tax
//  To output the desired information
// Using this class, write a program to accomplish the intended task

#include<iostream>
using namespace std;
class Tax{
    string name;
    double income;
    double tax;
    public:
    void input(){
        cout<<"Enter name of the individual: ";
        cin>>name;
        cout<<"Enter income of the individual: ";
        cin>>income;
    }
    double computeTax(){
         if(income<=100000){
            tax=0;
         }
         if(income>100000 && income<=150000)
         {
            tax=(income-100000)*0.1;
         }
          if(income>150000 && income<=200000)
         {
            tax=(income-150000)*0.2;
         }
          if(income>200000)
         {
            tax=(income-200000)*0.3;
         }
    }
    void output(){
        cout<<"Name: "<<name<<endl;
        cout<<"Your tax to be paid is: "<<tax<<endl;
        cout<<"Thank you"<<endl;
    }
};
int main(){
    Tax t1;
    t1.input();
    t1.computeTax();
    t1.output();
}