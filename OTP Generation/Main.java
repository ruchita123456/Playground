#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int sum=1;
  int rem;
  while(n!=0)
  {
  rem=n%10;
  sum=sum*rem;
  n=n/10;
  
  }
  cout<<sum;
  return 0;
}