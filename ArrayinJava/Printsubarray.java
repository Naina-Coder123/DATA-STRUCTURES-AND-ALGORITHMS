import java.util.*;
public class Printsubarray{
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int maxi=0;
       int start=0;
      // int end=0;
        int n=arr.length;
        //Bruteforce
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //                 int sum=0;

        //         for(int k=i;k<=j;k++){
        //             sum+=arr[k];
        //            // System.out.println(sum);
        //             if(sum>maxi){
        //                 maxi=sum;
        //               //  System.out.println(maxi);
        //               start=i;
        //               end=j;

        //             }


                

        //         }
           // }

      //  }
        //better
        //   for(int i=0;i<n;i++){
        //    int sum=0;
        //     for(int j=i;j<n;j++){
        //             sum+=arr[j];
        //            // System.out.println(sum);
        //             if(sum>maxi){
        //                 maxi=sum;
        //               //  System.out.println(maxi);
        //               start=i;
        //               end=j;

        //             }
        //         }
        //     }


                //Optimal
                int ansend=-1;
                int ansstart=-1;
                int sum=0;
                for(int i=0;i<n;i++){
                    if(sum==0)start=i;
                    / sum+=arr[i];

                    if(sum>maxi){
                        maxi=sum;
                        ansstart=start;
                        ansend=i;
                    }
                    if(sum<0){
                        sum=0;
                        continue;
                    }

                }
        System.out.println(maxi);
         for(int h=ansstart;h<=ansend;h++){
             System.out.println(arr[h]+ " ");
         }
    }
}