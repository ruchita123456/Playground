#include <iostream>
using namespace std;
int dec_bin(int n);
int main() 
{
   int n;
  cin>>n;
  printf("%d",dec_bin(n));
  return 0;
}

int dec_bin(int n)
{
int rev=0,pow=1,rem;
  while(n!=0)
  {
  rem=n%2;
  rev=rev+rem*pow;
  n=n/2;
  pow=pow*10;  
  }
return rev;
}