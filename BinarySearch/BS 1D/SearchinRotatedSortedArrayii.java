public class SearchinRotatedSortedArrayii {
    public static void main(String[] args) {
        int[] nums={1,0,1,1,1};
        int n=nums.length;
        int target=0;
        System.out.println(search(nums,target));
    }
     public static boolean search(int[] nums, int target) {
        int n=nums.length;
         int low=0;
         int high=n-1;
         while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]==nums[low] && nums[mid]==nums[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid] ){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<target && nums[high]>=target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
         }
         return false;
    }
}
