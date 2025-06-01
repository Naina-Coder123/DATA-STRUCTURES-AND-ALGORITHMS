import java.util.*;
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{9,11},{8,10},{2,4},{15,18},{16,17}};
        
        int n=intervals.length;
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
        });
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);

                }
                else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }
        //return ans;
        System.out.println(ans);
        //  int[][] result=new int[ans.size()][2];
        // for(int i=0;i<ans.size();i++){
        //     result[i][0]=ans.get(i).get(0);
        //     result[i][1]=ans.get(i).get(1);
        // }
       // return result;
    //    for(int i=0;i<result.length;i++){
    //     for(int j=0;j<result.length-1;j++){
    //         System.out.print(result[i][j]+ " ");
    //     }
    //    }
        
    }
}
    

