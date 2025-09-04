public class ImplStackusingArray {
    static int top=-1;
   static  int[] stack=new int[10];//fixed size array
    public static void main(String[] args) {
        push(2);
        push(7);
        pop();
        pop();
        top();
        push(4);
        push(9);
        top();
        size();

        
    }
    static void push(int element){
        if(top==stack.length){
            System.out.println("Stack is full ,cannot push element!");
            return;
        }
        top=top+1;
        stack[top]=element;
    }
   static void pop(){
        if(top==-1){
            System.out.println("Stack is empt,y cannot pop!");
            return;
        }
        int element=stack[top];
        top=top-1;
    }
    static void top(){
        if(top==-1){
            System.out.println("Cannot access element");
            return;
        }
        System.out.println(stack[top]);
    }
    static void size(){
        System.out.println(top+1);
    }
}
