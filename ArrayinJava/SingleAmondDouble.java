import java.util.*;
public class SingleAmondDouble {
    public static void main(String[] args) {
        int[] arr={2,2,5,5,20,30,30};
        int n=arr.length;
        // for(int i=0;i<n;i++){
        //     int j=count(arr,arr[i]);
        //     if(j==1){
        //         System.out.println(arr[i]);
        //     }
        // }
        //Optimised

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }

        }

    }
    // static int count(int[] arr,int t){
    //     int c=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==t){
    //             c++;
    //         }
    //     }
    //     return c;
    // }

    private static int getOrDefault(int num, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrDefault'");
    }
}
