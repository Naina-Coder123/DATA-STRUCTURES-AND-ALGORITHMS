import java.util.Scanner;
import java.util.ArrayList;
public class GenerateBinaryStringswithoutConsecutive1s {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        ArrayList<String>arr=new ArrayList<>();
        generateBinaryStrings(0,list,arr,n);
        System.out.println(list);
    }
    static void generateBinaryStrings(int i,ArrayList<ArrayList<String>>l,ArrayList<String>arr,int n){
        if(i==n )
        {if( noConsecutive1s(arr, 0)){
            l.add(new ArrayList<>(arr));
        }
        return;
    }
        arr.add("0");
        generateBinaryStrings(i+1, l, arr, n);
        arr.remove(arr.size()-1);
        arr.add("1");
        generateBinaryStrings(i+1, l, arr, n);
        arr.remove(arr.size()-1);
    }
    static boolean noConsecutive1s(ArrayList<String> arr,int i){
        if(i==arr.size()-1){
            return true;

        }
        if(arr.get(i).equals("1") && arr.get(i+1).equals("1")){
            return false;
        }
        return noConsecutive1s(arr, i+1);

    }
}
