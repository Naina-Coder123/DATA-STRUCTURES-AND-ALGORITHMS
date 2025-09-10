import java.util.Stack;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int[] heights={2,1,5,6,2,3};
        int largest=largestRectangleArea(heights);
        System.out.println(largest);
    }
   static public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] left=pse(heights,n);
        int[] right=nse(heights,n);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int contri=(right[i]-left[i]-1)*heights[i];
            max=Math.max(max,contri);
        }
        return max;
    }
   static int[] pse(int[] heights,int n){
        int[] left=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& heights[st.peek()]>heights[i]){
                st.pop();
            }
            left[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return left;
    }
    static int[] nse(int[] heights,int n){
        int[] right=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&& heights[st.peek()]>=heights[i]){
                st.pop();
            }
            right[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return right;
    }
}
