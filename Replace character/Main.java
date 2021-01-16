#include <iostream>
#include<string.h>
using namespace std;

void Replacechar(char str[],char ch1,char ch2,int  len)
{
for(int i=0;i<len;i++)
{
if(str[i]==ch1)
  str[i]=ch2;
  else if(str[i]==ch2)
    str[i]=ch1;
 }
  cout<<str;
}
int main() 
{
   char a[100];
  char b,c;
  int len;
  cin>>a>>b>>c;
  len=strlen(a);
  Replacechar(a,b,c,len);
  return 0;
}