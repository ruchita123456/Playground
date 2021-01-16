#include<iostream>
using namespace std;

int result (int arr[], int x, int n,int m);

int main ()
{
  int x, i, n,m;
  cin>>x;
  int arr[x];
  for (i = 0; i < x; i++)
    {
      cin>>arr[i];
    }
  cin>>n;
  cin>>m;
  result (arr, x, n, m);
  for(i=0;i<x;i++)
  {
    cout<<arr[i]<<" ";
  }
  return 0;
}

int result (int arr[], int x, int n,int m)
{
  int i;
  for (i = 0; i < x; i++)
    {
      if ( (arr[i]-n ) < m)
	  {
	   arr[i]=arr[i]+1;
	  }
    }
}