public class ImplementLowerBound {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,6,7,7,8};
        int n=arr.length;
        int target=5;
        System.out.println(lowerBound(arr,n,target));
    }
    static int lowerBound(int[] arr,int n,int target){
        int left=0;
        int right=n-2;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}
