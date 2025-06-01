import java.util.*;
public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        int n=nums.length;
        //Bruteforce
        ArrayList<Integer>l=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(count(nums[i],nums)>n/3){
        //         if(!l.contains(nums[i])){
        //             l.add(nums[i]);
        //         }
        //     }

        // }
        //Better
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0 )+1);
        // }
        // for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        //     if(entry.getValue()>n/3){
        //         if(!l.contains(entry.getKey())){
        //             l.add(entry.getKey());
        //         }
        //     }

        // }
        //optimise
        int cnt1=0;
        int cnt2=0;
        int ele1=0;
        int ele2=0;
        for(int i=0;i<n;i++){
            if(cnt1==0 && ele2!=nums[i]){
                ele1=nums[i];
                cnt1=1;
            }
            else if(cnt2==0 && ele1!=nums[i]){
                ele2=nums[i];
                cnt2=1;
            }
            else if(ele1==nums[i]){
                cnt1++;
            }
            else if(ele2==nums[i]){
                cnt2++;
        }
        else{
            cnt2--;
            cnt1--;
        }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++){
            if(ele1==nums[i])cnt1++;
            if(ele2==nums[i])cnt2++;

        }
        int mini=n/3;
        if(cnt1>mini){
            l.add(ele1);

        }
        if(cnt2>mini){
            l.add(ele2);
        }

        
        System.out.println(l);
    }
    // static int count(int num,int[] nums){
    //     int n=nums.length;
    //     int c=0;
    //     for(int i=0;i<n;i++){
    //         if(nums[i]==num){
    //             c++;
    //         }

    //     }
    //     return c;
    // }

}
