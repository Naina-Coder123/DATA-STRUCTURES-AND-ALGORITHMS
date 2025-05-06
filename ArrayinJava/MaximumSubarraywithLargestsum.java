import java.util.*;

public class MaximumSubarraywithLargestsum {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scn.nextInt());
        }
        int largest = maxsubarray(l, n);
        System.out.println(largest);
    }

    public static int maxsubarray(ArrayList<Integer> l, int n) {
        // Bruteforce solution 1 Exshaustive search O(N^3)
        int sum = 0;
        //int maxi = 0;
        // for(int i=0;i<n;i++){
        // for(int j=0;j<n;j++){
        // sum=0;
        // for(int k=i;k<=j;k++){
        // sum+=l.get(j);

        // }
        // if(maxi<sum){
        // maxi=sum;
        // }
        // }

        // }
        // return maxi;

        // Incremental Update O(N^2)
        // for (int i = 0; i < n; i++) {
        //     sum = 0;
        //     for (int j = 0; j < n; j++) {
        //         sum += l.get(j);
        //         if (maxi < sum) {
        //             maxi = sum;
        //         }

        //     }
        // }
        //return maxi;
        int maxi=Integer.MIN_VALUE;
        //Optimised Approach O(N)
        for(int i=0;i<n;i++ ){
        sum+=l.get(i);
        if(sum>maxi){
        maxi=sum;
        }
        if(sum<0){
        sum=0;
        continue;
        }
        }
        return maxi;
    }

}
