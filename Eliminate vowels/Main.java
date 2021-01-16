#include <stdio.h>
int isVowel(char ch);
int main()
{
   char s[50],t[50];
  scanf("%s",s);
  int index=0;
  for(int i=0;s[i]!='\0';i++)
  {
  if(isVowel(s[i])==0)
  {
  	t[index++]=s[i];
  }  
  }
  t[index]='\0';
  strcpy(s,t);
  printf("%s",s);
  return 0;
}
int isVowel(char ch)
{
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
  return 1;
  else
    return 0;

}