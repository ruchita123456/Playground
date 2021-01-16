#include <iostream>
#include<string.h>
using namespace std;

int main() 
{
   char str[20];
  cin>>str;
  int i,len,flag=0;
  len=strlen(str);
  for(i=0;i<len;i++)
  {
  if(str[i]!=str[len-i-1])
  {
  	flag=1;
    break;
  }
  }
  if(flag==1)
    cout<<str<<" is not a palindrome";
  else
    cout<<str<<" is a palindrome";
  return 0;
}