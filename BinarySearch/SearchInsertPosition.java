public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target=7;
        System.out.println(searchInsert(arr, target));
    }
      public static int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return right+1;
    }
}
