#include<bits/stdc++.h>
using namespace std;
int linear_search(vector<int> &arr,int target){
for(int i=0;i<arr.size();i++){
    if(arr[i]==target){
        return i;
    }
}
}
int main(){
  int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int target;
    cin>>target;
 int p= linear_search(arr,target);
  cout<<p;
   
}