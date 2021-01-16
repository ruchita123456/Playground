#include <iostream>
using namespace std;

int calculate(int m,int n);


int main() 
{
   int m,n,result;
  cin>>m>>n;
  result=calculate(m,n);
  cout<<result;
    return 0;
}

int calculate(int m,int n)
{
  int sum=0;
	for(int i=m;i<=n;i++)
    {
    if((i%3==0) && (i%5==0))
    {
    sum=sum+i;
    }
 	}
return sum;
}