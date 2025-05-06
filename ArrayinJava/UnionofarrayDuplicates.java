
import java.util.*;
public class UnionofarrayDuplicates {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        int[] arr2={2,3,5};
        int n=arr.length;
        int m=arr2.length;
    //     HashSet<Integer>set=new HashSet<>();
    //     for(int num:arr){
    //         set.add(num);
    //     }
    //     for(int num:arr2){
    //         set.add(num);
    // }
    // System.out.println(set);
    // int n=set.size();
    // System.out.println(n);
    ArrayList<Integer>l=new ArrayList<>();
   for(int num:arr){
    if(!l.contains(num)){
        l.add(num);

    }
   }
   for(int num:arr2){
    if(!l.contains(num)){
        l.add(num);
    }
   }
    System.out.println(l.size());
    }
}
