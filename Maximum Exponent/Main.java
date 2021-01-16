#include <iostream>
using namespace std;
int countExp(int a,int b);
int maxExp(int n);
int main() 
{
   int a,b;
  cin>>a>>b;
  cout<<countExp(a,b);
  return 0;
}

int countExp(int a,int b)
{
	int max=-1;
  int num=0,result;
  	for(int i=a;i<=b;i++)
    {
    result=maxExp(i);
    if(result>max)
    {
    max=result;
     num=i; 
    }
    
    }
     return num;   

}

int maxExp(int n)
{
int count=0;
  while((n!=0) && (n%2==0))
  {
  count++;
    n=n/2;
  }
   return count; 
}