#include<bits/stdc++.h>
using namespace std;
 union_sorted(vector<int>nums,vector<int>num){
    set<int>s;
    for(int i=0;i<nums.size();i++){
        s.insert(nums[i]);
    }
    for(int i=0;i<nums.size();i++){
        s.insert(num[i]);
    }
    for(auto it:s){

    }
}
int main(){
      int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int d;
    cin>>d;
    vector<int>v(d);
      for(int i=0;i<d;i++){
        cin>>v[i];
    }
   union_sorted(arr,v);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}
