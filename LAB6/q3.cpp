#include<iostream>
#include<vector>
#include<algorithm>
#include<math.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
      int n;
      cin>>n;
      int x,y;
      cin>>x>>y;
      int mini=min(x,y);
      int ans=n%mini==0?n/mini:n/mini+1;
      cout<<ans<<endl;
          }
}