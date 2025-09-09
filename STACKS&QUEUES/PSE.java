import java.util.Stack;

class PSE{
    public static void main(String[] args){
        int[] arr={4,8,5,2,25};
        int[] res=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<=st.peek()){
                st.pop();
            }
            if(i<arr.length){
            if(!st.isEmpty()){
                res[i]=st.peek();
            }else{
                res[i]=-1;
            }
            }
            st.push(arr[i]);
        }
        for(int num:res){
            System.out.print(num + " ");
        }
    }
}