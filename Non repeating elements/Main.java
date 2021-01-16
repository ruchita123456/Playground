#include <iostream>
using namespace std;
int nonRepeat(int *arr,int *brr,int len1,int len2);
int main() 
{
  int len1,len2,i,j,result;
  cin>>len1>>len2;
  int arr[len1],brr[len2];
  for(i=0;i<len1;i++)
    cin>>arr[i];
  for(j=0;j<len2;j++)
    cin>>brr[j];
  
  result=nonRepeat(arr,brr,len1,len2);
  cout<<endl<<result;
  return 0;
}

int nonRepeat(int *arr,int *brr,int len1,int len2)
{
int count=0,flag,i,j;
  for(i=0;i<len1;i++)
  {
  flag=0;
  for(j=0;j<len2;j++)
  {
  if(arr[i]==brr[j])
  {
  flag=1;
    break;
  }
  }
    if(flag==0)
    {
    cout<<arr[i]<<" ";
      count++;
    }
  
  }
  
  for(i=0;i<len2;i++)
  {
  flag=0;
  for(j=0;j<len1;j++)
  {
  if(brr[i]==arr[j])
  {
  flag=1;
    break;
  }
  }
    if(flag==0)
    {
    cout<<brr[i]<<" ";
      count++;
    }
  
  }
  return count;
}