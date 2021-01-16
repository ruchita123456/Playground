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
  int i,k,key;
  for(k=1;k<n;k++)
  {
  key=a[k];
  for(i=k-1;a[i]>key && i>=0;i--)
  {
  	a[i+1]=a[i];
  }
  a[i+1]=key;
  }
   for(int i=0;i<n;i++)
  {
  	cout<<a[i]<<" ";
 }
  return 0;
}