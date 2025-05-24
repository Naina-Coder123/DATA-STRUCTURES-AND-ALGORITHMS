
import java.util.*;
public class StockBuyandSell {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
     //Bruteforce Approach
      //  int maxProf=0;
        int n=prices.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int m=prices[j]-prices[i];
        //         if(m<0){
        //             continue;
        //         }
        //         else{
        //         maxProf=Math.max(maxProf,m);
        //         }

        //     }

        // }
        // //return maxProf;
       // System.out.println(maxProf);
         int maxProf=Integer.MIN_VALUE;
        int mini=prices[0];
        int max=0;
        for(int i=1;i<n;i++){
            if(mini>prices[i]){
                mini=prices[i];
            }
            maxProf=Math.max(prices[i],mini);
           max=Math.max((maxProf-mini),max);
        }
      //  return max;
      System.out.println(max);
    }

}
