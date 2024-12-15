#include<bits/stdc++.h>
using namespace std;
//using Brute force approach if the arry does not contains duplicate TC---O( N LOGN) SC---O(1)


// int second_largest(vector<int> &arr,int n){
//     sort(arr.begin(),arr.end());
//     return arr[n-2];
// }
//first traversing whole array to find the largest and then traversing to find the second largest
///TC----O(N) SC---O(1)

// int second_largest(vector<int> &arr,int n)
// {
//     int m=INT_MIN;
//     for(int i=0;i<n;i++){
//         if(arr[i]>m){
//           m=arr[i];
//         }
//     }
//     int s=0;
//     for(int i=0;i<n;i++){
//         if(arr[i]>s&& arr[i]<m){
//            s=arr[i];   
//              }
//     }
//     return s;
// }


//using set TC--O(NLOG N) SC---O(K)
 int second_largest(vector<int> &arr,int n){

   set<int>s(arr.begin(),arr.end());
   int size=s.size();
   if(size==1){
       return -1;
   }
   vector<int>v(s.begin(),s.end());
   int m=v.size();
   return v[m-2];
 }
    int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int p=second_largest(arr,n);
    cout<<p;

}