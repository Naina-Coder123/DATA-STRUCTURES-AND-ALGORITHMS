import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=0){
                m++;
            }
        }
        int n=nums2.length;
          //bruteforce 
        // int[] num=new int[m+n];
        // int i=0;
        // int j=0;
        // int c=0;
        // while(i<m && j<n){
        //     if(nums1[i]<=nums2[j]){
        //         num[c++]=nums1[i++];
        //     }
        //     else{
        //         num[c++]=nums2[j++];
        //     }
        // }
        // while(i<m){
        //     num[c++]=nums1[i++];
        // }
        // while(j<n){
        //     num[c++]=nums2[j++];
        // }
        // for(int k=0;k<m+n;k++){
        //     nums1[k]=num[k];
        // }
        //optimised
        int i=m-1;
        int j=n-1;
        int c=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[c--]=nums1[i--];
            }
            else{
                nums1[c--]=nums2[j--];
            }
        }
        while(i>=0){
            nums1[c--]=nums1[i--];
        }
        while(j>=0){
            nums1[c--]=nums2[j--];
        }
        for(int k=0;k<nums1.length;k++){
            System.out.println(nums1[k]+" ");

        }
    }
    }

