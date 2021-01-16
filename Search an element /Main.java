#include <iostream>
using namespace std;

int search(int n,int arr[],int ele);

int main() 
{
   int n,ele,pos;
  cin>>n;
  int arr[n];
    for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  } 
  cin>>ele;
  search(n,arr,ele);
 return 0;
}

int search(int n,int arr[],int ele)
{
int i,flag=0;
  for(i=0;i<n;i++)
  {
  if(ele == arr[i])
  {
   cout<<"index = "<<i;
     flag = 1;
    break;
  }
  }
  if(flag == 0)
  {
  cout<<"-1";
  }
}