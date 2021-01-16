#include<stdio.h>

int bin_dec(int n);
int main() 
{
   int n;
  scanf("%d",&n);
  printf("%d",bin_dec(n));
  
}

int bin_dec(int n)
{
	int rem,pow=1,num=0;
  	while(n>0)
    {
    	rem=n%10;
      	num=num+rem*pow;
      	pow=pow*2;
      	n=n/10;
    }
return num;
}