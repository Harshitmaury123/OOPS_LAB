// Experiment 7: Create a record of 10 employee which contains following information: emp_id., 
// emp_name, and age. Create a C++ (OOPs concept) program to search an employee with its emp_id.

#include<iostream>
using namespace std;

class Employee{
    private:
     int emp_id;
    string emp_name;
    int emp_age;
    public:
    void setEmployeeDetails(){
        cout<<"Enter the employee id:"<<endl;
        cin>>emp_id;
        cout<<"Enter the employee name:"<<endl;
        cin>>emp_name;
        cout<<"Enter the employee age:"<<endl;
        cin>>emp_age;
    }
    int getEmpid(){
        return emp_id;
    }
    void getEmployeeDetails(){
        cout<<"Employee id is:"<<emp_id<<endl;
        cout<<"Employee name is:"<<emp_name<<endl;
        cout<<"Empoyee age is:"<<emp_age<<endl;
    }
};

int main(){
    Employee emp[3];
    for(int i=0;i<3;i++){
        emp[i].setEmployeeDetails();
    }
    int search_id;
    cout<<"Enter the employee_id to search"<<endl;
    cin>>search_id;
    for(int i=0;i<3;i++){
        if(emp[i].getEmpid()==search_id){
           emp[i].getEmployeeDetails();
        }
    }
}
