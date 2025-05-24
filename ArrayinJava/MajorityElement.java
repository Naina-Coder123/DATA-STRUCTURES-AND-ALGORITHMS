import java.util.*;
public class MajorityElement{
    public static void main(String[] args) {
        int[] nums={3,2,3};
        //Bruteforce Aprroach O(n^2)
        int n=nums.length/2;
        // for(int i=0;i<n;i++){
        //     if(count(nums,nums[i])>n){
        //         System.out.println(nums[i]);

        //     }
        // }
        //
        //Optimal Solution
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>n){
                System.out.println(entry.getKey());
            }
        }
    }
    //   public  static int count(int[] arr,int element){
    //         int c=0;
    //         for(int i=0;i<arr.length;i++){
    //             if(arr[i]==element){
    //                 c++;
    //             }
    //         }
    //         return c;
    //     }


    

}