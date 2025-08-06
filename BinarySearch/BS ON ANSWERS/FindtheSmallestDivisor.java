class FindtheSmallestDivisor{
    public static void main(String[] args) {
        int[] nums={1,3,5,9};
        int threshold=6;
        System.out.println(smallestDivisor(nums, threshold));

    }
    static int smallestDivisor(int[] nums, int threshold) {
        //bruteforce solution
        int maxi=max(nums);

        // for(int i=1;i<=maxi;i++){
        //     int s=divide(nums,i);
        //     if(s<=threshold){
        //         return i;
        //     }

        // }
        // return maxi;
        //dummy return statement

        //optimise solution
        int result=0;
        int low=1;
        int high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                double d=Math.ceil((double)nums[i]/(double)mid);
                sum+=d;
                
            }
            if(sum<=threshold){
                result=mid;
                high=mid-1;

            }
            else {
                low=mid+1;
            }
        }
        return result;
    }
     static int max(int[] nums){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi){
                maxi=nums[i];
            }
        }
        return maxi;
    }
    // static int divide(int[] nums,int element){
    //     int sum=0;
    //     for(int i=0;i<nums.length;i++){
    //         double d=Math.ceil((double)nums[i]/(double)element);
    //         sum+=d;
    //     }
    //     return sum;

    // }
}
