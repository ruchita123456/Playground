#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int *arr,pos,val;
  arr=(int*) malloc (n*sizeof(int));
  if(arr==NULL)
  {
  exit(0);
  }
  for(int i=0;i<n;i++)
  {
  	cin>>arr[i];
  }
  cin>>pos>>val;
  for(int i=n-1;i>=pos-1;i--)
  {
  	arr[i+1]=arr[i];
  }
  arr[pos-1]=val;
  for(int i=0;i<=n;i++)
  {
  	cout<<arr[i]<<" ";
  }
  return 0;
}