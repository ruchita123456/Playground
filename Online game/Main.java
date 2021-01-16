#include<iostream>
using namespace std;

void swap(int *i, int *j)
{
    int temp = *i;
    *i = *j;
    *j = temp;
}
int seperateEvenAndOdd(int arr[], int size)
{
    int left = 0;
    int right = size - 1;
    while(left < right)
    {
        while(arr[left]%2 == 0 && left < right)
        {
            left++;
        }
     
while(arr[right]%2 == 1 && left < right)    
        {
            right--;
        } 
if(left < right)
        {
            swap(&arr[left], &arr[right]);
            left++;
            right--;
        }
    }
}
int main()
{
    int arr_size;
    cin >> arr_size;
    int arr[arr_size];
 
    for(int i=0;i<arr_size;i++)
    {
        cin >> arr[i];
    }
    int i=0;
    seperateEvenAndOdd(arr,arr_size);
   
    for(i=0;i<arr_size;i++)
	  cout << arr[i] << " ";
    return 0;
}

    

