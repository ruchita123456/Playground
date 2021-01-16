#include <iostream>
#include<math.h>
using namespace std;

int main() 
{
   int s,n,m;
  cin>>s>>n>>m;
  int ans;
  ans=pow(s,n);
  ans=ans%10;
  ans=pow(ans,m);
  ans=ans%1000000007;
  cout<<ans;
  return 0;
}