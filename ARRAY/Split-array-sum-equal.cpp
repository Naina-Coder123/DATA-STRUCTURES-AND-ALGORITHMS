#include<bits/stdc++.h>
using namespace std;
bool canSplit(vector<int>& arr) {
        // code here
        //Brute force Approach
        int left=0;
        for(int i=0;i<arr.size();i++){
            left+=arr[i];
            int r=0;
            
            for(int j=i+1;j<arr.size();j++){
                r+=arr[j];
                
            }
            if(left==r){
                return true;
                
            }
        }
        return false;
    }
    int main(){
        int n;
        cin>>n;
        vector<int>arr(n);
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
       int p= canSplit(arr);
       cout<<p;

    }