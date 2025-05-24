import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,7,1,2,4,0,9};
        int target=13;
        int n=arr.length;
        //Bruteforce 
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if((arr[i]+arr[j])==target){
        //             System.out.println(i + " "+ j);
        //             //return new int[] {i,j};
        //         }
        //     }
        // }
       // System.out.println("-1"+ " "+ "-1");
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<n;i++){
        map.put(arr[i],i);
       }
       System.out.println(map);
       int c;
       for(int i=0;i<n;i++){
        if(map.containsKey(target-arr[i])){
            if((map.get(target-arr[i]))!=i){
                c=map.get(target-arr[i]);
                System.out.println(i+ " "+c );
                break;
            }
        }
       }
    }
}
