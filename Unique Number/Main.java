#include <iostream>
using namespace std;

void Uniquedig(int l,int r)
{
	int count=0;
  	for(int i=l;i<=r;i++)
    {
      	int num=i;
    	int visited[10]={0};
      while(num)
      {
      	if(visited[num%10])
          break;
       visited[num%10]=1;
      num=num/10;
    }
  if(num==0)
    count++;
  
 }
  if(count>0)
    cout<<count;
  else
    cout<<"No Unique Number";
}


int main() 
{
   int l,r;
  cin>>l>>r;
  Uniquedig(l,r);
  return 0;
}