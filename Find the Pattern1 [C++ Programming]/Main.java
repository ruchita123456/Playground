#include <iostream>
using namespace std;
int pattern(int n)
{
  int i,j;
   //Your code goes here
  for(i=1;i<=n;i++)
  {
  for(j=1;j<=n;j++)
  {
  if(i==1 || i==n || j==1 || j==n)
 	 cout<<"1";
  
  else
      cout<<" ";
  }
  cout<<"\n";
  }
}
int main()
{
    int n;
    cin>>n;
    pattern(n);
}
