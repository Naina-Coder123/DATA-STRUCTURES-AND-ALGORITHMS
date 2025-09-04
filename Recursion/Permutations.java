import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static void poss(int i, int[] nums, List<List<Integer>> list) {
        if (i == nums.length) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                l.add(nums[j]);
            }
            list.add(new ArrayList<>(l));
            return;
        }
        for (int ind = i; ind < nums.length; ind++) {
            swap(ind, i, nums);
            poss(i + 1, nums, list);
            swap(ind, i, nums);
        }
    }

    static void swap(int ind, int i, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[ind];
        nums[ind] = temp;
    }



    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        permute(nums);

    }

    static public void permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // int[] map=new int[nums.length];
        // possible(0,nums,map,list,new ArrayList<Integer>());
        poss(0, nums, list);
        System.out.println(list);
    }
}
    // static void possible(int i,int[] nums,int[]
    // map,List<List<Integer>>list,List<Integer>l){
    // if(i==nums.length){
    // list.add(new ArrayList<>(l));
    // return;
    // }
    // for(int ind=0;ind<nums.length;ind++){
    // if(map[ind]!=1){
    // l.add(nums[ind]);
    // map[ind]=1;
    // possible(i+1,nums,map,list,l);
    // l.remove(l.size()-1);
    // map[ind]=0;
    // }
    // }
    // }

