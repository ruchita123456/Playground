#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int pass,temp,flag=0;
  int a[n];
  for(int i=0;i<n;i++)
  {
  	cin>>a[i];
  }
  for(pass=0;pass<n-1;pass++)
  {
  	for(int i=0;i<n-pass-1;i++)
    {
      if(a[i]>a[i+1])
      {
    	temp=a[i];
      a[i]=a[i+1];
      a[i+1]=temp;
      flag=1;
    }
    }
  if(flag==0)
  {
    break;
  }
   
  }
   for(int i=0;i<n;i++)
  {
  	cout<<a[i]<<" ";
  }
   // return 0;
}