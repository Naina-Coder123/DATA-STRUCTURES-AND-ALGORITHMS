import java.util.Stack;

public class SumSubarrayRanges{
    public static void main(String[] args) {
        
        int[] nums={1,2,3,4};
        long num=subArrayRanges(nums);
        System.out.println(num);
    }
      static public long subArrayRanges(int[] nums) {
        //bruteforce approach //exhaustive search
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //          int maxi=Integer.MIN_VALUE;
        //          int mini=Integer.MAX_VALUE;
        //         for(int k=i;k<=j;k++){
        //             maxi=Math.max(maxi,nums[k]);
        //             mini=Math.min(mini,nums[k]);
        //             System.out.println(maxi + " " + mini);
        //         }
                
        //         sum+=(maxi-mini);
        //         System.out.print(sum);
        //     }
        // }
        // return sum;


        //Incremental Update
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     int maxi=nums[i];
        //     int mini=nums[i];
        //     for(int j=i;j<nums.length;j++){
        //         maxi=Math.max(maxi,nums[j]);
        //         mini=Math.min(mini,nums[j]); 
        //         sum+=(maxi-mini);
        //     }
        // }
        // return sum;



        //Optimised Approach using MONOTONIC STACK
       int n=nums.length;
       return maximumSum(nums,n)-minimumSum(nums,n);
             

    }
   static  long minimumSum(int[] nums,int n){
        // int mod=1000000009;
         int[] left=new int[n];
         int[] right=new int[n];
         Stack<Integer>s=new Stack<>();
         //previous smaller
         for(int i=0;i<n;i++){
            while(!s.isEmpty() && nums[s.peek()]>nums[i]){
                s.pop();
            }
            left[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
         }
         s.clear();

         //next smaller
         for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()]>=nums[i]){
                s.pop();
            }
            right[i]=s.isEmpty()?n:s.peek();
            s.push(i);
         }
         s.clear();
         long rightCount=0;
         long leftCount=0;
         long res=0;
         for(int i=0;i<n;i++){
            leftCount=i-left[i];
            rightCount=right[i]-i;
            res+=(long)nums[i]*leftCount*rightCount;
                    
                     }
           return res;

    }
       static long maximumSum(int[] nums,int n){
            // int mod=1000000009;
         int[] left=new int[n];
         int[] right=new int[n];
         Stack<Integer>s=new Stack<>();
         //previous greater
         for(int i=0;i<n;i++){
            while(!s.isEmpty() && nums[s.peek()]<nums[i]){
                s.pop();
            }
            left[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
         }
         s.clear();

         //next greater
         for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()]<=nums[i]){
                s.pop();
            }
            right[i]=s.isEmpty()?n:s.peek();
            s.push(i);
         }
         s.clear();

         long rightCount=0;
         long leftCount=0;
         long res=0;
         for(int i=0;i<n;i++){
            leftCount=i-left[i];
            rightCount=right[i]-i;
            res+=(long)nums[i]*leftCount*rightCount;
                    
                     }
               return res;

    }
}