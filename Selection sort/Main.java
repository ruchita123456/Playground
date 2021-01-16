#include<stdio.h>

void selection_sort(int *a, int n)
{ 
  int i,pos,m,temp;
  for(pos=0;pos<=n-1;pos++)
  {
  m=pos;
    for(i=pos+1;i<n;i++)
    {
    if(a[i]<a[m])
      m=i;
    }
    temp=a[pos];
    a[pos]=a[m];
    a[m]=temp;
  
  }
    
    
      for(i=0; i<n; i++)
   {       
    	 printf("%d ", a[i]);    
   }
 }

int main()
{
   int a[30], n;
   int i;    
   scanf("%d", &n);    
   for(i=0; i<n; i++) 
   {       
    	 scanf("%d", &a[i]);
   }    
   selection_sort(a,n);   
 
 }
