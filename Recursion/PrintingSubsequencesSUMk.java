import java.util.ArrayList;
public class PrintingSubsequencesSUMk {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int k=2;
        ArrayList<Integer>l=new ArrayList<>();
        int sum=0;
        int n=arr.length;
        printSubsequences2(0,l,sum,k,arr,n);

    }
    static boolean flag=false;
    static void printSubsequences(int i,ArrayList<Integer>l,int sum,int k,int[] num,int n){
        // if(i==n){
        //     if(sum==k){
        //         System.out.println(l);
                
        //     }
        //     return;

        // }
        // l.add(num[i]);
        // sum+=num[i];
        // printSubsequences(i+1, l, sum, k, num, n);
        // l.remove(l.size()-1);
        // sum-=num[i];
        // printSubsequences(i+1, l, sum, k, num, n);


        //for printing any subsequence whose sum is k 
        if(i==n){
            if(sum==k && flag==false) {
                System.out.println(l);
                flag=true;
            }
            return;
        }
        l.add(num[i]);
        sum+=num[i];
        printSubsequences(i+1, l, sum, k, num, n);
        l.remove(l.size()-1);
        sum-=num[i];
        printSubsequences(i+1, l, sum, k, num, n);
        //this technique is fruitful but if we have to print only one subsequence then when we get any subsequence whose sum is equal to k we return from right there no need to call further recursion calls

       
    }
    static boolean printSubsequences2(int i,ArrayList<Integer>l,int sum,int k,int[] num,int n){
        
        // technique to print only one answer
        if(i==n){
            if(sum==k ){
                System.out.println(l);
                return true;
            }
            return false;
        }
        l.add(num[i]);
        sum+=num[i];
       if( printSubsequences2(i+1, l, sum, k, num, n)==true)return true;
        l.remove(l.size()-1);
        sum-=num[i];
        if(printSubsequences2(i+1, l, sum, k, num, n)==true) return true ;
        return false;
    }

    }

