public class CountOccurenceinSortedArray {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,3,3,4};
        int target=3;
         int x=first(arr,target);
        int y=last(arr,target);
       // return y-x+1;
       System.out.println(y-x+1);
        

    }
       static int first(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int res=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                res=mid;
                high=mid-1;
                
            }
            else if(arr[mid]<target){
                low=mid+1;
                
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    static  int last(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int res=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                res=mid;
                low=mid+1;
                
            }
            else if(arr[mid]<target){
                low=mid+1;
                
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
}
