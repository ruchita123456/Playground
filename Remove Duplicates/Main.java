#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  for(int i=0;i<n;i++)
  {
   int count=0;
    for(int j=i;j>=0;j--)
    {
    if(a[i]==a[j])
      count++;
    
    }
  if(count==1)
    cout<<a[i]<<" ";
  }
      return 0; 
      
      
  
}