#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
  	for(int j=i+1;j<=n;j++)
    {
    	for(int k=i+2;k<=n;k++)
        {
        	if((i*i)+(j*j)==k*k)
              printf("%d\t%d\t%d\n",i,j,k);
        
        }
    }
  
  }
  return 0;
}