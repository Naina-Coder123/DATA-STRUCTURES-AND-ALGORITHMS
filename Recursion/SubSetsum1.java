import java.util.ArrayList;
import java.util.Collections;
public class SubSetsum1 {
    public static void main(String[] args) {
        int[] arr={5,2,1};
        int n=3;
        ArrayList<Integer>list=new ArrayList<>();
        subSetSum1(0,arr,n,list,0);
        Collections.sort(list);
        System.out.println(list);

    }
    static void subSetSum1(int i,int[] arr,int n,ArrayList<Integer>list,int sum){
        if(i==n){
            list.add(sum);
            return;
        }
        sum+=arr[i];
        subSetSum1(i+1, arr, n, list, sum);
        sum-=arr[i];
        subSetSum1(i+1, arr, n, list, sum);
    }
}
