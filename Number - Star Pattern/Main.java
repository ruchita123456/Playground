#include <iostream>
using namespace std;

int main() 
{
   int n,count=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
  for(int j=0;j<n;j++)
  {
  	count++;
    if(j==n-1)
      printf("%d",count);
    else
      printf("%d*",count);
  
  }
  printf("\n");
  }
  return 0;
}