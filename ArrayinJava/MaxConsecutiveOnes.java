import java.util.*;
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,1};
        int n=arr.length;
        int count=0;
        int max_count=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
               max_count= Math.max(count, max_count);
            }else{
                count=0;
            }
        }
        System.out.println(max_count);
    }
}
