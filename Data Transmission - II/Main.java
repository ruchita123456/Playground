#include <iostream>
using namespace std;

int main() 
{
   string str,rev;
  cin>>str;
  int len=str.size();
  int i,j,count=0;
  for(i=0,j=len-1;i<len,j>=0;i++,j--)
  {
  	if(str[i]==str[j])
      count++;
  
  }
  cout<<count;
  return 0;
}