import java.util.ArrayList;

public class CountSubsequences {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int n=arr.length;
        int sum=0;
        int k=2;
        int count=countSubsequences(0,sum,k,arr,n);
        System.out.println(count);
    }
   static int  countSubsequences(int i,int sum,int k,int[] num,int n){
    //counting technique for entire questions
    // int f(){
    //     base case
    //     return 1 condition satisfies
    //     return 0 condition not satisfies
    //  l=f()
    //  r=f()
    //  return l+r
    // }
    if(sum>k)return 0;
    //strictly
    //this condition if sum surpasses the k and it will be applicable if array contain only positive integers
    //thus this will reduce the time complexity slightly 
    //overall time complexity for this question is 2^n because there are n indexes and for every index we have choices pick it up and not pick it up so 2 2 2 .........2^n 
    if(i==n){
        if(sum==k){
            return 1;
        }
        return 0;
    }
    sum+=num[i];
   int left= countSubsequences(i+1,  sum, k, num, n);
    sum-=num[i];
   int r= countSubsequences(i+1,  sum, k, num, n);
    return left+r;

   }
}
