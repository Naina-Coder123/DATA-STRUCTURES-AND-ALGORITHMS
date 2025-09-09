import java.util.Stack;

class NGE{
    public static void main(String[] args) {
        int[] arr={4,12,5,3,1,2,5,3,1,2,4,6};
        int[] res=new int[arr.length];
        nge(arr,res);
for(int num:res){
    System.out.print(num+ " ");
}
    }
    static void nge(int[] arr,int[] res){
        //Approach 1 TC=O(N^2) SC=O(N)
        // for(int i=0;i<arr.length;i++){
        //    int ans= find(arr[i],arr,i);
        //    res[i]=ans;
        // }
        //Approach 2 using stack   time complexity O(2N) N space complexity O(n) +O(n)
       Stack<Integer>st=new Stack<>();
       for(int i=2*arr.length-1;i>=0;i--){
        while(!st.isEmpty() && st.peek()<=arr[i%arr.length] ){
            st.pop();
        }
        if(i<arr.length){
        if(!st.isEmpty()){
            res[i]=st.peek();
        }
        else{
            res[i]=-1;
        }
        }
        st.push(arr[i%arr.length]);

       }
    }
    static int find(int x,int[] arr,int ind){
        for(int i=ind+1;i<arr.length;i++){
            if(arr[i]>x)return arr[i];
        }
        return -1;
    }
}