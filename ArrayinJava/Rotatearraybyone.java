import java.util.*;

public class Rotatearraybyone {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        
        int orig=arr[n-1];
    for(int i=n-2;i>=0;i--){
        arr[i+1]=arr[i];
    }
        arr[0]=orig;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
    

