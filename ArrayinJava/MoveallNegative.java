import java.util.*;
//we have to move all negative numbers to begining and all positive numbers to the end
public class MoveallNegative {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        move(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void move(int[] arr,int n){
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]<0){
                mid++;
            }
            else {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}
