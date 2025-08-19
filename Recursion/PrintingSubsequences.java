import java.util.ArrayList;

class PrintingSubsequences{
    public static void main(String[] args) {

        int[] arr={3,1,2};
        int n=3;
                ArrayList<Integer>list=new ArrayList<>();
        printSubsequences(0,list,arr,n);

    }
    static void printSubsequences(int i,ArrayList<Integer>l,int[] arr,int n){
        if(i==n){
           System.out.println(l);
           return;
        }
        l.add(arr[i]);
        printSubsequences(i+1, l, arr, n);
        l.remove(l.size()-1);
        printSubsequences(i+1, l, arr, n);
    }
}