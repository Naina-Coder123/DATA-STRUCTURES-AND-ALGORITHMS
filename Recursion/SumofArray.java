public class SumofArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        System.out.println(f(n));
    }
    static int f(int n){
        if(n<0){
            return 0;
        }
        return n+f(n-1);
    }
}
