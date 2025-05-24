import java.util.*;
public class ArrayLead{
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        //Bruteforce approach
//        int n=arr.length;
//         ArrayList<Integer>l=new ArrayList<>();
//         if(n==0){
//             //return l;
//             System.out.println(l);
//         }
//         if(n==1){
//             l.add(arr[0]);
//             //return l;
//             System.out.println(l);
//         }
//         for(int i=0;i<n-1;i++){
//             int max=0;
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]<arr[j]){
//                     max=0;
//                     break;
//                 }
//                 else{
//                     max=arr[i];
//                 }
//             }
//             if(max!=0){
//                 l.add(max);
//             }
//         }
//         l.add(arr[n-1]);
//        // return l;
//        System.out.println(l);
//    

 //Optimal Solution
    int n=arr.length;
        
        ArrayList<Integer>l=new ArrayList<>();
        if(n==0){
            //return l;
            System.out.println(l);
        }
        l.add(arr[n-1]);
        int max=arr[n-1];
        int j=n-2;
        while(j>=0){
            if(arr[j]>=max){
                l.add(arr[j]);
                max=arr[j];
            }
            j--;
        }
        Collections.reverse(l);
        System.out.println(l);
        //return l;
}




}