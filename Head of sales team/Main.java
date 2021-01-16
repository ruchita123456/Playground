#include <iostream>
using namespace std;

int main() 
{
   int n,rem,sum=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
  	cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
  int t=a[i];
    while(t!=0)
    {
    rem=t%10;
    sum=sum+rem;
    t=t/10;  
    }
    cout<<sum<<" ";
    sum=0;
  }
  return 0;
}