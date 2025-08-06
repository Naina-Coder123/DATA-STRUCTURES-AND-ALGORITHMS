public class SearchSingleelementinSortedArray {
    public static void main(String[] args) {
        int[] nums={3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));

    }
     static int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];

        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2!=0 && nums[mid]==nums[mid-1])){
                low=mid+1;
            }
            else if((mid%2!=0 && nums[mid]==nums[mid+1]) || (mid%2==0 && nums[mid]==nums[mid-1])){
                high=mid-1;
            }
            
        }
        return -1;
    }
}
    


