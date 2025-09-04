import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class CombiationSum2 {
    public static void main(String[] args) {
        int[] candidates={10,1,2,7,6,1,5};
        int target=8;
        combinationSum2(candidates,target);
    }
      static public void combinationSum2(int[] candidates, int target) {
        int n=candidates.length;
        Arrays.sort(candidates);
        List<List<Integer>>l=new ArrayList<>();
        // List<List<Integer>>li=new ArrayList<>();
        sum(0, candidates,target,new ArrayList<>(),n,l);
        System.out.println(l);
    }
   static  void sum(int i,int[] num,int target,List<Integer>list,int n,List<List<Integer>>l){
    
            if(target==0){
                l.add(new ArrayList<>(list));
                return;
            }
            
            for(int ind=i;ind<num.length;ind++){
             if(ind>i && num[ind]==num[ind-1])continue;
                if(num[ind]>target)break;
                 list.add(num[ind]);
            sum(ind+1,num,target-num[ind],list,n,l);
            list.remove(list.size()-1); 
            }
    }
}
