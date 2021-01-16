#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int *arr,pos;
  arr=(int *) malloc (n*sizeof(int));
  if(arr==NULL)
  {
  exit(0);
  }
  for(int i=0;i<n;i++)
    cin>>arr[i];
  cin>>pos;
  if(pos>=n+1)
  {
  cout<<"Deletion not possible.";
    
  }
  else
  {
  for(int i=pos-1;i<n-1;i++)
  		arr[i]=arr[i+1];
  for(int i=0;i<n-1;i++)
    	cout<<arr[i]<<" ";
}
  return 0;
}