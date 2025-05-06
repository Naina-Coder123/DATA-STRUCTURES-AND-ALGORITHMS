import java.util.*;

public class MinandMax {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }
        int[] result=findMinMax(arr, n);
        System.out.println(result[0] + " " + result[1]);

    }

    public static int[] findMinMax(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        // Bruteforce Idea using O(2n)
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] < mini) {
        //         mini = arr[i];

        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] > maxi) {
        //         maxi = arr[i];

        //     }
        // }
        // return new int[] { mini, maxi };
        //Optimised solution using O(1.5n)
        for(int i=0;i<n;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
            else if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return new int[]{mini,maxi}; 

    }
}