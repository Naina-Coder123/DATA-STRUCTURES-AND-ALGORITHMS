import java.util.Stack;

public class MaximalRectangle{
    public static void main(String[] args) {
        char[][] matrix={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        int max=maximalRectangle(matrix);
        System.out.println(max);
    }
     static public int maximalRectangle(char[][] matrix) {
        int[][] prefixSum=new int[matrix.length][matrix[0].length];
        int maxArea=0;
        for(int j=0;j<matrix.length;j++){
            int sum=0;
            for(int i=0;i<matrix[0].length;i++){
             if(matrix[j][i]=='1'){
                prefixSum[j][i]=(j==0?1:prefixSum[j-1][i]+1);
             }
               else
               prefixSum[j][i]=0;           }
        }
        for(int i=0;i<prefixSum.length;i++){
            maxArea=Math.max(maxArea,largestRec(prefixSum[i]));
        }
        return maxArea;
    }
   static int largestRec(int[] arr){
        int[] left=pse(arr);
        int[] right=nse(arr);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int contri=(right[i]-left[i]-1)*arr[i];
            max=Math.max(max,contri);
        }
         return max;
    }
    static int[] pse(int[] arr){
        int n=arr.length;
        Stack<Integer>s=new Stack<>();
        int[] left=new int[arr.length];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>arr[i]){
                s.pop();
            }
            left[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
        }
        return left;
    }
     static int[] nse(int[] arr){
        int n=arr.length;
        Stack<Integer>s=new Stack<>();
        int[] right=new int[arr.length];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            right[i]=s.isEmpty()?n:s.peek();
            s.push(i);
        }
        return right;
    }
}