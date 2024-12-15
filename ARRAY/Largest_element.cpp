#include<bits/stdc++.h>
using namespace std;
//Using for loop for finding the largest ---O(N)
// int largest1(int arr[],int n){
//         if(n==1){
//             return arr[0];
//         }
//         int maxi=INT_MIN;
//         for(int i=0;i<n;i++){
//             if(arr[i]>=maxi){
//                 maxi=arr[i];
//             }
//         }
//         return maxi;
// }
//USING SORTING AND RETURNING LAST INDEX TC---O(N LOGN)  SC----O(1)
// int largest2(int arr[],int n){
//      if(n==1){
//             return arr[0];
//         }
//        sort(arr,arr+n);
//        return arr[n-1];
// }
//USING PRIORITY_QUEUE TC----O(1) SC----O(N)
int largest3(vector<int> &arr,int n){
  
        if(n==1){
            return arr[0];
        }
     priority_queue<int>pq(arr.begin(),arr.end());
     int p=pq.top();
     return p;
}


int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    
    for(int i=0;i<n;i++){
    cin>>arr[i];
    }
    int m=largest3(arr,n);
    cout<<m;
}