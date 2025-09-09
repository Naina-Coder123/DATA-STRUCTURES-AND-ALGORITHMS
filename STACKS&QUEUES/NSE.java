import java.util.Stack;

public class NSE {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        int[] arr={3,1,2,4};
        int[] res=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=st.peek()){
                st.pop();

            }
            if(i<arr.length){
                if(!st.isEmpty()){
                    res[i]=st.peek();
                }else res[i]=-1;
            }
            st.push(arr[i]);
        }
        for(int num:res){
            System.out.print(num + " ");
        }
    }
}
