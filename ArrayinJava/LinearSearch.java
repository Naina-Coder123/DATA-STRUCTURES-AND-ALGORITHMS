import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int element=input.nextInt();
        for(int i=0;i<n;i++){
            if(element==arr[i]){
                System.out.println("The element" + " " +arr[i] +"is present at the index" + " "+i);
            }
            
        }
    
    }
}
