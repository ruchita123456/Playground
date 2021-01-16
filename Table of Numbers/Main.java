#include <iostream>
using namespace std;

int main() 
{
   int n,num;
  int sum=0;
  cin>>n;
  for(int i=1;i<=10;i++)
  {
  num=n*i;
  cout<<num<<" ";
  sum=sum+num;
  }
   cout<<endl<<sum;
  return 0;
}