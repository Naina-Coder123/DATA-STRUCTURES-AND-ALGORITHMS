import java.util.*;
public class SlidingWindowMaximum{
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int n=arr.length;
        //Bruteforce Approach
        int k=3;
        ArrayList<Integer>l=new ArrayList<>();
        int d=k;
        // for(int i=0;i<n-k+1;i++){
        //     int max=0;
        //     for(int j=i;j<d;j++){
        //         if(arr[j]>max){
        //             max=arr[j];
        //         }
        //     }
        //    l.add(max);
        //    d++;
            
        // }
       
        
        System.out.println(l);
    }
}