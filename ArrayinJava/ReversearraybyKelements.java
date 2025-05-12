import java.util.*;

public class ReversearraybyKelements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        int n = arr.length;
        // int[] num=new int[k];
        // int j=0;
        // for(int i=n-k;i<=n-1;i++){
        // num[j]=arr[i];
        // j++;
        // }
        // for(int i=n-1;i>=k;i--){
        // arr[i]=arr[i-k];
        // }
        // for(int i=0;i<k;i++){
        // arr[i]=num[i];
        // }
        // Approach 2;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
