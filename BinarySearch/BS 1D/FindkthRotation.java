import java.util.ArrayList;
import java.util.List;

public class FindkthRotation {
    public static void main(String[] args) {
ArrayList<Integer>l=new ArrayList<>();      
l.add(32);
l.add(18);
l.add(26);
l.add(30);
  System.out.println(findKRotation(l));

    }
     static int findKRotation(List<Integer> arr) {
        // Code here 
        int n=arr.size();
        int low=0;
        int high=n-1;
        int i=0;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            // if(arr.get(low)<=arr.get(high)){
            //     ans=Math.min(ans,arr.get(low));
            //     i=low;
            //     break;
           // }
            if(arr.get(low)<=arr.get(mid)){
                // ans=Math.min(ans,arr.get(low));
                if(ans>arr.get(low)){
                    ans=arr.get(low);
                     i=low;

                }
                low=mid+1;
                
            }
            else{
                 if(ans>arr.get(mid)){
                    ans=arr.get(mid);
                     i=mid;

                }
                high=mid-1;
                
            }
        }
        return i;
         
        
    }
}
