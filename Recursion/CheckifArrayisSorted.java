public class CheckifArrayisSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(        f(0,arr)
);
    }
    static boolean f(int i,int[] arr){
        int n=arr.length;
        if(i==n-1)return true;
        if(!(arr[i]<=arr[i+1])){
            return false;

        }
        return f(i+1, arr);


    }
}
