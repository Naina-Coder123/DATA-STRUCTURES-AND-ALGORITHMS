import java.util.Stack;

public class ImplQueueUsingStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args) {
        push(4);
        push(2);
        push(3);
        push(5);
        top();
        top();
        pop();
        push(1);
        pop();
        push(6);
        top();
        pop();
        System.out.println(s1);
    }
    // static void push(int x){
    // while(!s1.isEmpty()){
    // s2.push(s1.peek());
    // s1.pop();
    // }
    // s1.push(x);
    // while(!s2.isEmpty()){
    // s1.push(s2.peek());
    // s2.pop();
    // }
    // //this approach will take the O(2N) time and space(2*dynamic space)
    // // so this approach is inefficient
    // }
    // static void pop(){
    // s1.pop();
    // }
    // static void top(){
    // System.out.println(s1.peek());
    // }
    //

    // using approach 2
    static void push(int x) {
        s1.push(x);
    }

    static void top() {
        if (!s2.isEmpty()) {
            System.out.println(s2.peek());
        } else {
            while (!s1.isEmpty()) {
                s2.push(s1.pop()); // fix: pop directly from s1 into s2
            }
            if (!s2.isEmpty()) {
                System.out.println(s2.peek()); // print only after transfer
            } else {
                System.out.println("Queue is empty");
            }
        }
    }

    static void pop() {
        if (!s2.isEmpty()) {
            s2.pop();   // dequeue from s2 if available
        } else {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());   // move elements only if s2 is empty
            }
            if (!s2.isEmpty()) {
                s2.pop();
            } else {
                System.out.println("Queue Underflow");
            }
        }
    }
}
