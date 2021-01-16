#include <iostream>
using namespace std;

int binary(int num)
{
	int rem;
  int rev=0;
  	while(num!=0)
    {
    rem=num%2;
    rev=rev*10+rem;
    num=num/2;  
    
    }  
return rev;
}
int main() 
{
   int n;
  cin>>n;
  for(int i=1;i<=n;i=i+2)
  cout<<binary(i)<<endl;
  return 0;
}