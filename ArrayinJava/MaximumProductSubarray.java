import java.util.*;
public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums={2,3,-2,4};
        int n=nums.length;
        //bruteforce O(N^3) //EXHAUSTIVE SEARCH
          int max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int prod=1;
        //         for(int k=i;k<=j;k++){
        //             prod*=nums[k];
        //             max=Math.max(prod,max);
        //         }
        //     }
        //}
        // //Incremental Update O(N^2)
        // for(int i=0;i<n;i++){
        //     int prod=1;
        //     for(int j=i;j<n;j++){
        //         prod*=nums[j];
        //         max=Math.max(prod,max);
        //     }
        // }
         int prefix=1;
      int suffix=1;
      for(int i=0;i<n;i++){
        if(prefix==0)prefix=1;
        if(suffix==0)suffix=1;
        prefix*=nums[i];
        suffix*=nums[n-i-1];
        max=Math.max(max,Math.max(prefix,suffix));
      }


        System.out.println(max);
    }
}
