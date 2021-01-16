#include <iostream>
using namespace std;

int main() 
{
   int a,b,c;
  cin>>c>>a>>b;
  switch(c)
  {
    case 1: c=a+b;
      		cout<<c;
      		break;
    case 2: c=a-b;
      		cout<<c;
      		break;
    case 3: c=a*b;
      		cout<<c;
      		break;
    case 4: c=a/b;
      		cout<<c;
      		break;  
    default: break; 
  
  }
  return 0;
}