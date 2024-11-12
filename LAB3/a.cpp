#include<iostream>
#include<vector>
#include<algorithm>
#include<math.h>
using namespace std;
string important(int n){
   string s=to_string(n);
   int len=s.length();
   if(s.length()<=2){
    return "NO";
   }
   if(s[0]=='1' && s[1]=='0'){
    string s1="";
     for(int i=2;i<len;i++){
        s1+=s[i];
     }
     if(s1=="1" || s1[0]=='0'){
        return "NO";
     }
     else{
         return "YES";
     }
   }
   else{
    return "NO";
   }
}
int main(){
    int t;
    cin>>t;
    vector<int>arr(t);
        for(int i=0;i<t;i++){
            cin>>arr[i];
        }
    for(int i=0;i<t;i++){
        cout<<important(arr[i])<<endl;
    }
}