public class FloorandCeil {
    public static void main(String[] args) {
        int[] arr={1,2,8,10,10,12,19};
        int target=11;
        floorCeil(arr, target);
    }
    static void floorCeil(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        // return new int[]{low,high};
        System.out.println(arr[low]+ " "+ arr[ high]);


    }
    
}
