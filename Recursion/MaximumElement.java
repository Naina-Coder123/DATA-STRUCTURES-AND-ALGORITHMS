public class MaximumElement {
    public static void main(String[] args) {
        int[] arr={1,4,8,9};
        int max=-1;
        System.out.println(maximum(0, arr,max));
    }
    static int maximum(int i,int[] arr,int max){
        
        int n=arr.length;
        if(i==n){
            return max;
        }
        if(arr[i]>max){
            max=arr[i];
        }
 return maximum(i+1, arr,max);
    }
}
