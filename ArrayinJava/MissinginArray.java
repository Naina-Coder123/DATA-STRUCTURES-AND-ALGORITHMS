import java.util.*;
public class MissinginArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        //System.out.println(n);
    int size=n+1;
    for(int i=1;i<=size;i++){
        if(isPresent(arr,i)){
            continue;
        }
        else{
            System.out.println(i);
        }
    }

    }
    static boolean isPresent(int[] arr,int t){
        boolean bool=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                bool=true;
                break;
            }
        }
        return bool;
    }
}
