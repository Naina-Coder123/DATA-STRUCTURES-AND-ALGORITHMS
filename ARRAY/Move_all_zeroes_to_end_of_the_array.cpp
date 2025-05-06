#include<bits/stdc++.h>
using namespace std;
//Brute force Approach

// int move_zeroes(vector<int> &nums){
//    vector<int>v;
//    for(int i=0;i<nums.size();i++){
//     if(nums[i]!=0){
//         v.push_back(nums[i]);

//     }
//    }
//    int d=v.size();
  
//         for(int i=0;i<d;i++){
//             nums[i]=v[i];
//         }
//    for(int j=d;j<nums.size();j++ ){
//     nums[j]=0;

//    }
// }
//Using Two Pointer Approach
int move_zeroes(vector<int> &nums){
   int i=0;
      int j=0;
      int n=nums.size();
      for(int j=0;j<n;j++){
        if(nums[j]!=0){
            nums[i]=nums[j];
            i++;
        }
      }
      for(int k=i;k<n;k++){
        nums[k]=0;
      }
}
int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    move_zeroes(arr);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}