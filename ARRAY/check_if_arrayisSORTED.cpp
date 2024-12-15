#include<bits/stdc++.h>
using namespace std;
//USING BRUTE FORCE APPROACH TC---O(N) SC---O(1)
bool sort(vector<int> &arr,int n){
int b=true;
    for(int i=1;i<n;i++){
        if(!(arr[i-1]<=arr[i]))
            b=false;
        }
    
    return b;
    }

int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
   cout<< sort(arr,n);
}