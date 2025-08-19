public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
    //  reverse(0, 4, arr);
    reverse(0,arr);
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
     }
    }


    // static void reverse(int left,int right,int[] arr){
    //     if(left>=right)
    //     return;
    //     int temp=arr[left];
    //     arr[left]=arr[right];
    //     arr[right]=temp;
    //     reverse(left+1,right-1,arr);

    // }
    ///passing one parameter
    static void reverse(int i,int[] arr){
        int n=arr.length;
        if(i>=n/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reverse(i+1,arr);
    }
   
}
