import java.util.*;
public class FindtheRepeatedandMissingNumber {
    public static void main(String[] args) {
        int[] arr={3,1,2,5,3};

  ArrayList<Integer>l=new ArrayList<>();
        //bruteforce O(N^2)
        int n=arr.length;
//         for(int i=1;i<=n;i++){
//             if(count(arr,i)==2){
//                 l.add(i);
                
//             }
//             // else if(count(arr,i)==0){
//             //     l.add(i);
//             //}
//             // else{
//             //     continue;
//             // }
            
//         }
//         for(int i=1;i<=n;i++){
//             if(count(arr,i)==0){
//                 l.add(i);
//             }
//         }
//        // return l;


 //better tc-O(2n) sc-O(n)
    // HashMap<Integer,Integer>map=new HashMap<>();
    // for(int num:arr){
    //     map.put(num,map.getOrDefault(num,0)+1);
    // }
    // for(Map.Entry<Integer,Integer>entry:map.entrySet()){
    //     if(entry.getValue()==2){
    //         l.add(entry.getKey());
    //     }
    // }
    // int sum=0;
    // int s=(n*(n+1))/2;
    // for(int i=0;i<n;i++){
    //     sum+=arr[i];
    // }
    // sum=sum-l.get(0);
    // l.add(s-sum);
    //   //return l;
        

       //optimal tc-O(nlogn+2n) sc-O(1)
    Arrays.sort(arr);
    for(int i=0;i<n-1;i++){
        if((arr[i]^arr[i+1])==0){
            l.add(arr[i]);
        }
        else{
            continue;
        }
    }
      int sum=0;
    int s=(n*(n+1))/2;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    sum=sum-l.get(0);
    l.add(s-sum);
    
     
      System.out.println(l);
        
    }
//    static  int count(int[] arr,int element){
//         int n=arr.length;
//         int c=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]==element){
//                 c++;
//             }
//         }
//         return c;
//     }
}
