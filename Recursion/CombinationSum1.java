import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void main(String[] args) {
        int[] candidates={2,3,6,7};
        int target=7;
        combinationSum(candidates,target);
    }
   static public void combinationSum(int[] candidates, int target) {
        List<List<Integer>>list=new ArrayList<>();
        int n=candidates.length;
        sum(0,new ArrayList<>(),list,n,target,candidates);
        System.out.println(list);

    }
  static void sum(int i,List<Integer>l,List<List<Integer>>list,int n,int target,int[] num){
    if(i==n){
        if(target==0){
            list.add(new ArrayList<>(l));

        }
        return;
    }
    if(num[i]<=target){
    l.add(num[i]);
    sum(i,l,list,n,target-num[i],num);
    l.remove(l.size()-1);
    }
    
      sum(i+1,l,list,n,target,num);
    



   }
}
