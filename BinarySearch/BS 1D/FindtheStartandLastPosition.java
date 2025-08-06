public class FindtheStartandLastPosition {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
         int low=0;
        int n=nums.length;
        if(n==0){
            // return new int[]{-1,-1};
            System.out.println("-1" + "-1");
        }
       int x= first(nums,target);
       int y=last(nums,target);
    //    return new int[]{x,y};
    System.out.println(x+" "+y);
    }
     
  static  int first(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                res=mid;
                high=mid-1;

            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
      static int last(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                res=mid;
                low=mid+1;

            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }

    
}
