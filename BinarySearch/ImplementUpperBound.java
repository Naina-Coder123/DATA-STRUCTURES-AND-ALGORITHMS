public class ImplementUpperBound {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5,5,7,8};
        int target=4;
        System.out.println(upperBound(arr,target));
    }
       static int upperBound(int[] arr, int target) {
        int n=  arr.length;
        // code here
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]<=target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left;
    }
}
