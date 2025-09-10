import java.util.Stack;

public class SubarrayMin {
    public static void main(String[] args) {
        int[] arr={3,1,2,4};
       int result= sumSubarrayMins(arr);
        System.out.println(result);

    }
    static public int sumSubarrayMins(int[] arr) {
        long result=0;
        int mod=1000000007;
        int[] left=leftCompute(arr);
        int[] right=rightCompute(arr);
        for(int i=0;i<arr.length;i++){
            int l=countLeft(left,i);
            int r=countRight(right,i);
            result=(result+(long)arr[i]*l*r)%mod;
        }
        return (int)result;
    }
   static int countLeft(int[] leftCompute,int i){
        return leftCompute[i];
    }
      static int countRight(int[] rightCompute,int i){
        return rightCompute[i];
    }

  static  int[] leftCompute(int[] arr){
        Stack<int[]>s=new Stack<>();
        int[] left=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
           while(!s.isEmpty() && s.peek()[0]>arr[i]){
            count+=s.pop()[1];
           }
           left[i]=count;
           s.push(new int[]{arr[i],count});
        }
        return left;
    }
       static int[] rightCompute(int[] arr){
        Stack<int[]>s=new Stack<>();
        int[] right=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int count=1;
           while(!s.isEmpty() && s.peek()[0]>=arr[i]){
            count+=s.pop()[1];
           }
           right[i]=count;
           s.push(new int[]{arr[i],count});
        }
        return right;
    }


}

