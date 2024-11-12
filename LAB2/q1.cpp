#include<iostream>
using namespace std;
class Bill{
    public:
    double compute(int n,int m,int p);
};
inline double Bill::compute(int n,int m,int p=10){
        double cost;
        double cminers=n*1500-(n*1500)*0.05;
        double ctoasters=m*200-(m*200)*0.10;
        double cfans=p*450-(p*450)*0.15;
        cost=cminers+ctoasters+cfans;
        cost+=cost*0.10;
        return cost;
}
int main(){
    int m;
    cin>>m;
    int n;
    cin>>n;
    int p;
    cin>>p;
    Bill b;
   double cost=b.compute(m,n,p);
   cout<<cost<<endl;
}