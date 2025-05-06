import java.util.*;
public class KthSmallest{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
    //   int result=kthSmallest(arr, k) ;
    PriorityQueue<Integer> pq=new PriorityQueue<>();//O(N+KLOGN)
    for(int num:arr){
        pq.add(num);
    }
    for(int i=0;i<k-1;i++){
        pq.poll();
    }
    int result=pq.peek();
       System.out.println(result);

    }
    // public static int kthSmallest(int[] arr, int k) {
    //     // Your code here
    //     //Bruteforce Idea using Bubble sort
    //     int n=arr.length;
    //     sort(arr,n);
    //     return arr[k-1];
      
    // }
    // public static void sort(int[] arr,int n){
    //       for(int i=0;i<n-1;i++){
    //         for(int j=0;j<n-i-1;j++){
    //             if(arr[j]>arr[j+1]){
    //             int temp=arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
    //             }
    //         }
    //     }
    // }

}