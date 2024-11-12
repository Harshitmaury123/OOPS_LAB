#include<iostream>
using namespace std;

class Data{
    private:
    int day;
    int month;
    int year;
    public:
     Data(){
        this->day=12;
        this->month=3;
        this->year=1993;
        cout<<"Default Constructor"<<endl;
     }
     Data(int day=12,int month=10,int year=2000){
        this->day=day;
        this->month=month;
        this->year=year;
        cout<<"Parametrised Constructor"<<endl;
     }
};

int main(){
    Data d1(10,10,2000);
    //COPY CONSTRUCTOR
    Data d(d1);
    cout<<"copied"<<endl;
    return 0;
}

 