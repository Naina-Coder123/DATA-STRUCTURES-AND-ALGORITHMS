 import java.util.*;
 public class ReversePairs {
public static void main(String[] args) {
       int[] nums={1,3,2,3,1};
//         //bruteforce 
//          int n=nums.length;
//         int count=0;
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]>nums[j]*2){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
  System.out.println(reversePairs(nums));
}

    public static int reversePairs(int[] nums) {
     int n=nums.length;
        //bruteforce approach
        // int count=0;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]>nums[j]*2){
        //             count++;
        //         }
        //     }
        // }
        // return count;
      //optimal
        return mergeSort(nums,0,n-1);
    }
   static int mergeSort(int[] arr,int low,int high){
    int count=0;
    if(low>=high)return count;
    int mid=(low+high)/2;
   count+= mergeSort(arr,low,mid);
   count+= mergeSort(arr,mid+1,high);
   count+= countP(arr,low,mid,high);
    merge(arr,low,mid, high);
    return count;

   }
   static void merge(int[] arr,int low,int mid,int high){
    int left=low;
    int right=mid+1;
    ArrayList<Integer>l=new ArrayList<>();
    while(left<=mid && right<=high){
        if(arr[left]<=arr[right]){
            l.add(arr[left]);
            left++;
        }
        else{
            l.add(arr[right]);
            right++;
        }
    }
    while(left<=mid){
        l.add(arr[left]);
        left++;
    }
    while(right<=high){
        l.add(arr[right]);
        right++;
    }
    for(int i=low;i<=high;i++){
        arr[i]=l.get(i-low);
    }
   }
   static int countP(int[] arr,int low,int mid,int high){
    int right=mid+1;
    int count=0;
    for(int i=low;i<=mid;i++){
 while (right <= high && (long) arr[i] > 2L * arr[right]){
            right++;
        } 
        count=count+(right-(mid+1));
    }
    return count;
   }
}

