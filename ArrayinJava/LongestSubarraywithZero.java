import java.util.*;
public class LongestSubarraywithZero {
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10,23};
          // bruteforce
         int max=0;
         int n=arr.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //          int sum=0;
        //         for(int k=i;k<=j;k++){
        //             sum+=arr[k];
                    
        //         }
        //         if(sum==0){
        //                 max=Math.max(max,j-i+1);
                        
        //             }
        //     }
        // }
        
        //better 
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum==0){
        //             max=Math.max(max,j-i+1);
        //         }
        //     }
        // }
      //  return max;
        
        //optimise
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                max=Math.max(max,i+1);
            }
            int rem=sum-0;
            if(map.containsKey(rem)){
                int p=i-map.get(rem);
                max=Math.max(max,p);
                
            }
            if(!map.containsKey(rem)){
                map.put(sum,i);
            }
        }
      System.out.println(max);
        
        
    }
    
}
