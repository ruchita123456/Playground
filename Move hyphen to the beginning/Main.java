#include <iostream>
#include<string.h>
using namespace std;

int main() 
{
   char str[100];
  	cin>>str;
  int len = strlen(str) - 1 ;
  int count=len;
  for(int i=len;i>=0;i--)
  {
  if(str[i]!='-')
  	str[count--]=str[i];
   }
  while(count>=0)
  {
  str[count--]='-';  
  }
  cout<<str;
}