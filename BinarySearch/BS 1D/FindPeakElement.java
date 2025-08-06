class FindPeakElement{
    public static void main(String[] args){
        int[] nums={1,2,3,1};
        System.out.println(findPeakElement(nums));

    }
    static  int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 0;

        }
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
              if(mid==0 && nums[mid]<nums[mid+1]){
            return mid+1;
        }

        else if( mid==0 && nums[mid]>nums[mid+1] ){
            return mid;
        }
        else if(mid==n-1 && nums[mid]>nums[mid-1]){
            return mid;
        }
        else if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
            return mid;
        }
        else if(nums[mid]<nums[mid+1]){
            low=mid+1;
        }else{
            high=mid-1;
        }
            
        }
        return -1;

    }
}