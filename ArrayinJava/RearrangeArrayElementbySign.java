import java.util.*;
public class RearrangeArrayElementbySign {
    public static void main(String[] args) {
        int[] arr={-3,1,-2,-5,2,-4};
        int n=arr.length;
        int i=0;int j=0;
        int[] num=new int[n];
        int c=0;
        while(i<n && j<n){
            while( i<n && arr[i]<0 ){
                i++;
            }if(i<n){
            num[c++]=arr[i++];
             }
               while( j<n&& arr[j]>0){
                j++;
            }
            if(j<n){
            num[c++]=arr[j++];
            }

        }
        for(int k:num){
            System.out.println(k);
        }

    }

 


}
