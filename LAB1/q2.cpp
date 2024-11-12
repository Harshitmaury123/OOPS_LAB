#include<iostream>
using namespace std;
struct Order{
    int miners=0;
    int toasters=0;
    int fans=0;
    double cost=0;
    double calculate(int n,int m,int p){
        double cminers=n*1500-(n*1500)*0.05;
        double ctoasters=m*200-(m*200)*0.10;
        double cfans=p*450-(p*450)*0.15;
        cost=cminers+ctoasters+cfans;
        cost+=cost*0.10;
        return cost;
    }
};

int main(){
    int n,m,p;
    cin>>n>>m>>p;
    double cost;
    Order o;
    cost=o.calculate(n,m,p);
    cout<<"The total cost is "<<cost<<endl;
    return 0;
}