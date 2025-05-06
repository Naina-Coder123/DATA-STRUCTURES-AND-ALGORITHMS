import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
       ArrayList< Integer >l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(scn.nextInt());
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:l){
          //  map.put(l, map.getOrDefault(num, 0) + 1);
            map.put(num, map.getOrDefault(num, 0) + 1);  // Corrected this line

        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>=2){
                System.out.println("True");
            }
            
        }
       // System.out.println("false");

    }
       // System.out.println(contains(l, n));
     

    }
    // public static boolean count(ArrayList<Integer>l,int n,int t){
    //     int count=0;
    //     for(int i=0;i<n;i++){
    //         if(t==l.get(i)){
    //             count++;
    //         }
    //     }
    //     if(count>=2){
    //         return true;
    //     }
    //     return false;
    // }
    // public static boolean contains(ArrayList<Integer>l,int n){
    //     for(int i=0;i<n;i++){
    //         if(count(l, n, l.get(i))){
//                 return true;
//             }
//         }
//         return false;

    
  
 //}
