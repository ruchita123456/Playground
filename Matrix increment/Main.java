#include <iostream>
using namespace std;

int main() 
{
   int n,r,c;
  cin>>r>>c>>n;
  int a[r][c];
  for(int i=1;i<=r;i++)
  {
  for(int j=1;j<=c;j++)
  {
  a[i][j]=n;
    n++;
    cout<<a[i][j]<<" ";
  }
    cout<<endl;
    
  }
  return 0;
}