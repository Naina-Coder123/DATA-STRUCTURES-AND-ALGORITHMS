import java.util.*;
public class ThreeSum{
    public static void main(String[] args){
        int[] nums={-1,0,1,2,-1,-4};
        //bruteforce
        //  Set<List<Integer>>l=new HashSet<>();
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //             List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k]);//fixed size list
        //             temp.sort(null);
        //             l.add(temp);
           
        //             }
        //         }
                
        //     }
        // }
        // List<List<Integer>>list=new ArrayList<>(l);
        //Better
         Set<List<Integer>>l=new HashSet<>();
    int n=nums.length;
    for(int i=0;i<n;i++){
        Set<Integer>set=new HashSet<>();
        for(int j=i+1;j<n;j++){
            int k=-(nums[i]+nums[j]);
            if(set.contains(k)){
                List<Integer>temp=Arrays.asList(nums[i],nums[j],k);
                temp.sort(null);
                l.add(temp);
                
            }
            set.add(nums[j]);

        }

    }
        List<List<Integer>>list=new ArrayList<>(l);
        //return list;

        System.out.println(list);
    }
}