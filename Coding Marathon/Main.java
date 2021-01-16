#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int N, K, sum = 0;
  cin >> N >> K;
  int arr[N];
  for(int i = 0; i < N; i++)
    cin >> arr[i];
  
  sort(arr, arr+N, greater<int>());
    
  for(int i = 0; i < K; i++)
    sum = sum + arr[i];
  
  cout << sum;
    return 0;
}