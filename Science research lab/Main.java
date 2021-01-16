#include <iostream>
using namespace std;

int main() 
{
   int n,larg1=0;
  int larg2=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  for(int i=0;i<n;i++)
  {
  	if(arr[i]>=larg1)
    {
    larg2=larg1;
    larg1=arr[i];
    }
    else if(arr[i]>larg2)
    {
    larg2=arr[i];
    }
  }
  cout<<larg1+larg2;
  return 0;
}