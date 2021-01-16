#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
  cin>>a[i];
  }
  int i,pos,m,temp;
  for(pos=0;pos<n-1;pos++)
  {
  	m=pos;
    for(int i=pos;i<n;i++)
    {
      if(a[i]<a[m])
        m=i;
    }
    temp=a[pos];
    a[pos]=a[m];
    a[m]=temp;
  }
  for(int i=0;i<n;i++)
  {
  cout<<a[i]<<" ";
  }
  return 0;
}