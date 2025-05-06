#include<bits/stdc++.h>
using namespace std;
void rotate(vector<int> &arr,int n,int d){
      int t=d%n;
      while(t!=0){
        int temp=arr[n-1];
        for(int i=n-2;i>=0;i--){
           arr[i+1]=arr[i];
        }
        arr[0]=temp;
      }
      t--;
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
    rotate(arr,n,d);
      for(int i=0;i<n;i++){
        cout<<arr[i];
    }

}