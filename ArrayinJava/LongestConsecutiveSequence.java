import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = { 102, 4, 100, 100, 101, 2, 2, 2, 1, 101, 3, 2, 1, 1 };
        // bruteforce solution
        int max = 1;
        int n = nums.length;

        // for( int i=0;i<n;i++){
        // int x=nums[i];
        // int count=1;
        // while(linearS(nums,x+1)==true){
        // x+=1;
        // count+=1;
        // }
        // max=Math.max(max,count);

        // }
        // better approach

        int count = 1;
        // Arrays.sort(nums);
        // if(n==0){
        // System.out.println("0");
        // }
        // for(int i=0;i<n-1;i++){
        // if(nums[i]+1==nums[i+1]){
        // count++;
        // max=Math.max(count,max);

        // }else if(nums[i]==nums[i+1]){
        // continue;
        // }
        // else{
        // count=1;
        // }
        // }
        // Optimise approach


        HashSet<Integer> set = new HashSet<>();
        for (int k : nums) {
            set.add(k);
        }
        for (int it : set) {
            if (!set.contains(it - 1)) {
                int x = it;
                count = 1;

                while (set.contains(x + 1)) {
                    x += 1;
                   // System.out.println("x" + x);
                    count++;
                  //  System.out.println("c" + count);

                    max = Math.max(count, max);
                   // System.out.println("max" + max);

                }

            }
        }

        // return max;
        System.out.println(max);
    }
    // static boolean linearS(int[] nums,int num){
    // int n=nums.length;
    // for(int i=0;i<n;i++){
    // if(nums[i]==num){
    // return true;
    // }
    // }
    // return false;
}
