import java.util.*;
public class MoveallzeoestotheEnd{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[] arr={1,2,0,4,3,0,5,0};
        int n=arr.length;
        for(int h=0;h<n;h++){
            System.out.println(arr[h]+" ");

        }
        //Bruteforce Approach
        // int i=0;
        // int j=0;
        // while(i<n){
        //     if(arr[j]!=0){
        //         j++;
        //         i=j+1;
        //     }
        //     if(i<n){
        //     if(arr[i]!=0&& arr[j]==0){
        //         int temp=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        //     }else{
        //         i++;
        //     }
        // }else
        // break;
        // }
        //Optimised Approach
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<arr.length){
            arr[count++]=0;
        }
        for(int k=0;k<n;k++){
            System.out.println(arr[k]+" ");

        }


    }

}