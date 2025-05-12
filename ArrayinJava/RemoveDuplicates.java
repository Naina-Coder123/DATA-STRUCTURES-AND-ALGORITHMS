import java.util.*;
public class RemoveDuplicates {
   public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();

    }
    // HashSet<Integer>set=new HashSet<>();
    // for(int num:arr){
    //     set.add(num);
    // }
    // System.out.println(set);
    // ArrayList<Integer>l=new ArrayList<>();
    // for(int num:set){
    //     l.add(num);
    // }
    // System.out.println(l);
    // System.out.println(l.size());
    //Second approach
    // int[] num=new int[n];
    // int j=0;
    // for(int i=0;i<n-1;i++){
    //     if(arr[i]!=arr[i+1]){
    //         num[j]=arr[i];
    //         j++;
    //     }
    // }
    // num[j]=arr[n-1];
    // for(int i=0;i<n;i++){
    //     System.out.println(num[i]+ " ");
    // }
    // System.out.println(j+1);

    //Third Approach
    int i=0;
    int j=i+1;
    while(j<n){
        if(arr[i]!=arr[j]){
            arr[i+1]=arr[j];
            i++;
            j++;
        }
        else{
            j++;
        }
         for(int k=0;k<n;k++){
        System.out.println(arr[k]+ " ");
    }
    System.out.println(i+1);
    }
    
   }

}
