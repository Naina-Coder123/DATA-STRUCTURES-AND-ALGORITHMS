import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSumii {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        Arrays.sort(arr);
        int n = 3;
        // HashSet<List<Integer>>set=new HashSet<>();
  List<List<Integer>>list=new ArrayList<>();
    subSet2(0,arr,list,new ArrayList<Integer>(),n);
        System.out.println(list);

    }
    // static void subSet2(int i,int[]
    // arr,HashSet<List<Integer>>set,ArrayList<Integer>l,int n){
    // if(i==n){
    // set.add(new ArrayList<>(l));
    // return;
    // }
    // l.add(arr[i]);
    // subSet2(i+1, arr, set, l, n);
    // l.remove(l.size()-1);
    // subSet2(i+1, arr, set, l, n);

    

     static void subSet2(int i,int[] arr,List<List<Integer>>l, ArrayList<Integer>ds,int n){
    l.add(new ArrayList<>(ds));
    for(int ind=i;ind<n;ind++){
        if(ind!=i && arr[ind]==arr[ind-1])continue;
        ds.add(arr[ind]);
        subSet2(ind+1,arr,l,ds,n);
        ds.remove(ds.size()-1);
    }
    }
}
