import java.util.*;
public class MinimumJumps {
    public static void main(String[] args) {
     int[] arr={1,3,5,8,9,2,6,7,6,8,9};
    
  int n=arr.length;
     if(n==0||arr[0]==0){
         return ;
     }
     int t=0;
     int count=0;
     int i=0;
     while(i<=t&&t<n-1){
         if(arr[i]==0){
             return ;
         }
         t=Mathmax(t,arr[i]+i);
         i++;
         count ++;
     }
     if(t>=n-1){
         return count;
     }
     return -1;
    }
}
