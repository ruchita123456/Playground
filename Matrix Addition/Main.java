#include <iostream>
using namespace std;

int main() 
{
   int i,j,k,l,m,n;
  int t;
  cin>>t;
  int first[10][10],second[10][10],sum[10][10];
  for(l=0;l<t;l++)
  {
  	cin>>m>>n;
    for(i=0;i<m;i++)
    {
    	for(j=0;j<n;j++)
        {
        cin>>first[i][j];
        }
    }
    for(i=0;i<m;i++)
    {
    	for(j=0;j<n;j++)
        {
        cin>>second[i][j];
        }
    }
    for(i=0;i<m;i++)
    {
    	for(j=0;j<n;j++)
        {
        sum[i][j]=first[i][j]+second[i][j];
        }
    }
    for(i=0;i<m;i++)
    {
    	for(j=0;j<n;j++)
        {
        cout<<sum[i][j]<<" ";
        }
    }
  cout<<endl;
  }
  return 0;
}