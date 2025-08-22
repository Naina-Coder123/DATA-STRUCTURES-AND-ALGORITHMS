import java.util.ArrayList;

public class CheckIFexistSubsequencesumK {
    public static void main(String[] args) {
          int[] arr={2,4,2};
        int k=4;
        int sum=0;
        int n=arr.length;
        System.out.println(checkSubsequences(0,sum,k,arr,n));
    }
    static boolean flag=false;
     static boolean checkSubsequences(int i,int sum,int k,int[] num,int n){
      

        if(i==n){
            if(sum==k) {
                return true;
            }
            return false;
        }
        sum+=num[i];
        if(checkSubsequences(i+1,  sum, k, num, n)==true)return true;
        sum-=num[i];
        if(checkSubsequences(i+1, sum, k, num, n)==true)return true;
  return false;
       
    }

   
}
