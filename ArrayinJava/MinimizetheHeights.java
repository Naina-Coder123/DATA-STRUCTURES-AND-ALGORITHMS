import java.util.*;
public class MinimizetheHeights {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(scn.nextInt());
        }
        int k=scn.nextInt();
        Collections.sort(l);
        int diff=l.get(n-1)-l.get(0);
        int res = diff;
        for(int i=0;i<n-1;i++){
            if(l.get(i)-k<0){
                continue;
            }
            int minH=Math.min(l.get(0)+k,l.get(i+1)-k);
            int maxH=Math.max(l.get(n-1)-k, l.get(i)+k);
           res= Math.min(res, maxH-minH);
        }
      System.out.println(res);
    }
}
