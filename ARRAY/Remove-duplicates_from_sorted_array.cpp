#include<bits/stdc++.h>
using namespace std;
//Using brute force approach TC----O(N LONG N) SC----O(N)
// int removeDuplicates(vector<int>& nums) {
//         int k=0;
//         set<int>s;
//         for(int i=0;i<nums.size();i++){
//             s.insert(nums[i]);
//         }
//         for(auto it:s){
//             nums[k]=it;
//             k++;
//         }
//         return k;
//     }
//USING Two pointer Approach TC----O(N) SC----o(1)
int removeDuplicates(vector<int> &nums){
    int i=0;
    for(int j=1;j<nums.size();j++){
        if(nums[i]!=nums[j]){
            nums[i+1]=nums[j];
            i++;
        }
    }
    return i+1;
}
int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
   cout<< removeDuplicates(arr);
}