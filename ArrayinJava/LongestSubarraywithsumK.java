import java.util.*;

public class LongestSubarraywithsumK {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,3,3};
        //we have to find the length of the longest //subarray //with //sum k 
        //for this we have 4 approaches
        //bruteforce approach Exhaustive search
        
        int given=6;
        int n=arr.length;
        int maxLen=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         int sum=0;
        //         for(int k=i;k<=j;k++){
        //             sum+=arr[k];
        //             //System.out.println(sum);
        //         }
        //         if(sum==given){
        //           maxLen=Math.max(maxLen, j-i+1);
        //          // System.out.println(maxLen);
        //         }
        //     }
        // }
        // System.out.println(maxLen);
        //Bruteforce but much better O(N^2)
        //   for(int i=0;i<n;i++){
        //      int sum=0;
        //     for(int j=i;j<n;j++){
        //             sum+=arr[j];
        //             //System.out.println(sum);
        //         if(sum==given){
        //           maxLen=Math.max(maxLen, j-i+1);
        //          // System.out.println(maxLen);
        //         }
        //     }
        // }
        // System.out.println(maxLen);
        //Better Approach Using Hashing
    //     Map<Long,Integer>preMap=new HashMap<>();
    //     Long sum=0l;
    //   for(int i=0;i<n;i++){
    //     sum+=arr[i];
    //     if(sum==given){
    //         maxLen=Math.max(maxLen,i+1);
    //     }
    //     Long rem=sum-given;
    //     if(preMap.containsKey(rem)){
    //         int len=i=preMap.get(rem);
    //         maxLen=Math.max(maxLen,len);

    //     }
    //     if(!preMap.containsKey(sum)){
    //         preMap.put(sum,i);

    //     }

        
    //   }
    //   System.out.println(maxLen);
     //Optimal Approach Using Two pointer O(2N)
     int left=0;
     int right=0;
     int sum=arr[0];
     while(right<n){
        while(left<=right && sum>given){
            sum-=arr[left];
            left++;


        }
        if(sum==given){
            maxLen=Math.max(maxLen, right-left+1);
        }
        if(right<n){
            sum+=arr[right];
            right++;
        }
     }
     System.out.println(maxLen);


     }

}