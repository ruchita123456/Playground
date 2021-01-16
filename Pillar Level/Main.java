#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int h1,h2;
  cin>>h1>>h2;
  int count=0;
  for(int i=0;i<n;i++)
  {
  if(h1%a[i]==0 && h2%a[i]==0)
    count++;
  
  }
  cout<<count;
  return 0;
}