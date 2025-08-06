public class NthRoot {
    public static void main(String[] args) {
        int n=2;
        int m=9;
        System.out.println(nthRoot(n,m));

    }
     static int nthRoot(int n, int m) {
        // code here
        int low=1;
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            if(Math.pow(mid,n)==m){
                return mid;
            }
            else if(Math.pow(mid,n)>m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
