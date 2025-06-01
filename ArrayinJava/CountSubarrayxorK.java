import java.util.*;
public class CountSubarrayxorK {
    public static void main(String[] args) {
        int[] arr={4,2,2,6,4};
                int n=arr.length;
                int k=6;
        //bruteforce
        int count=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int xor=0;
        //         for(int l=i;l<=j;l++){
        //             xor^=arr[l];
        //         }
        //         if(xor==k){
        //             count++;
        //         }
        //     }
            
        // }
        //better
        // for(int i=0;i<n;i++){
        //     int xor=0;
        //     for(int j=i;j<n;j++){
        //         xor^=arr[j];
        //         if(xor==k){
        //             count++;
        //         }
        //     }
        // }

        //optimise
          int xor=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            xor^=arr[i];
            if(xor==k){
                count++;
            }
            int rem=xor^k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
                map.put(xor,map.getOrDefault(xor,0)+1);
            
        }





        System.out.println(count);
    }
    
}
