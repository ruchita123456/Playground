#include <iostream>
using namespace std;

int NumberOfCarries(int num1 , int num2)
{
int sum=0,p,q,carry=0,count=0;
  while((num1!=0) && (num2!=0))
  {
  p=num1%10;
    q=num2%10;
    sum=p+q+carry;
    if(sum>9)
    {
    carry=1;
      count++;
    }
  else
  {
  carry=0;
  }
    num1=num1/10;
    num2=num2/10;
  }
  return count;
}



int main() 
{
   int x,y,a;
  cin>>x>>y;
  a=NumberOfCarries(x,y);
  cout<<a;
  return 0;
}