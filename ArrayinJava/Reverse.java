import java.util.*;
public class Reverse {
    

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scn.nextInt());
        }
        reverseList(list,n);
      for(int num:list){
        System.out.println(num);
      }


    }
    public static void reverseList(ArrayList<Integer> list,int n){
        int i=0;
        int j=list.size()-1;
        while(i<j){
            int temp=list.get(j);
            list.set(j,list.get(i));
            list.set(i,temp);
            i++;
            j--;


        }

    }
}
