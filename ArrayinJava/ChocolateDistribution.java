import java.util.*;
class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList <Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scn.nextInt());
        }
        int m=scn.nextInt();
        int result=findMinDiff(list,m);
        System.out.println(result);


    }
    public  static int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int n=arr.size();
        Collections.sort(arr);
        int min=Integer.MAX_VALUE;
       
        for(int i=0;i+m-1<n;i++){
            int diff=arr.get(i+m-1)-arr.get(i);
            if(diff<min){
                min=diff;            }
        }
        return min;
    }
    

    
        
    }
