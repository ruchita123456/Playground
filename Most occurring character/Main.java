#include<iostream>
using namespace std;
#include <string.h>

int main()
{
  	char str[100], result;
  	int i, len;
  	int max = -1;
   	int freq[256] = {0}; 
   	scanf("%[^\n]s",str);
  	len = strlen(str);
  	for(i = 0; i < len; i++)
  	{
  		freq[str[i]]++;
	}
  	for(i = 0; i < len; i++)
  	{
		if(max < freq[str[i]])
		{
			max = freq[str[i]];
			result = str[i];
		}
	}
	
	cout<<result;
	return 0;
}
