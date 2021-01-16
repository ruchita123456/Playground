#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int h,b;
  for(int i=1;i<=n;i++)
  {
  cin>>h;
   b=h*(h-1)/2;
    cout<<b<<endl;
  
  }
   
  return 0;
}