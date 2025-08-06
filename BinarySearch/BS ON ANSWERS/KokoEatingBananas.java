
public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h=8;
        //bruteforce O(N^2)
       // System.out.println(minEatingSpeed(piles,h));


       //optimal search
       int high=max(piles);
       int low=1;
       while(low<=high){
        int mid=(low+high)/2;
        int totalH=0;
        for(int i=0;i<piles.length;i++){
            totalH+=Math.ceil((double)piles[i]/(double)mid);
        }
        if(totalH<=8){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       System.out.println(low);

    }
//      static int minEatingSpeed(int[] piles, int h) {
//         int maxi=max(piles);
//         for(int i=1;i<=maxi;i++){
//             int reqTime=calTotalH(piles,i);
//             if(reqTime<=h){
//                 return i;
//             }
//         }
//         return maxi;
//         //dummy return statement

        
//     }
     static int max(int[] piles){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>maxi){
                maxi=piles[i];
            }
        }
        return maxi;
    }
//      static int calTotalH(int[] piles,int ele){
//         int n=piles.length;
//         int totalH=0;
//         for(int i=0;i<n;i++){
//             totalH+=Math.ceil((double)piles[i]/(double)ele);

//         }
//         return totalH;
//     }

 }

