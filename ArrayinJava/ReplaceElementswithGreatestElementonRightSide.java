import java.util.*;
public class ReplaceElementswithGreatestElementonRightSide {
    public static void main(String[] args) {
        int[] arr={17,18,5,4,6,1};
        int n=arr.length;
        //BruteforceApproach
        // for(int i=0;i<n;i++){
        //     int max=0;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>max){
        //             max=arr[j];
        //         }
        //     }
        //     arr[i]=max;
        // }
        // arr[n-1]=-1;
        // for(int num:arr){
        //     System.out.println(num+" ");
        // }
        //Optimal reverse traversing
        
     int max=-1;
     for(int j=n-1;j>=0;j--){
        int current=arr[j];
        arr[j]=max;
        if(current>max){
            max=current;
        }
     }
     for(int num:arr){
        System.out.print(num+ " ");
     }
    }

}
