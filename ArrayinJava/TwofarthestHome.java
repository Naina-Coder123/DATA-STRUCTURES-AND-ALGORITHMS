import java.util.*;
//Farthest home with different colors
public class TwofarthestHome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]!=arr[j]){
                    max=Math.max(Math.abs(i-j),max);
                }
            }
        }
        System.out.println(max);
    }
    
}
