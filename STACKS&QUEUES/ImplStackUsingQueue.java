import java.util.LinkedList;
import java.util.Queue;

public class ImplStackUsingQueue {
    public static void main(String[] args) {
        Queue<Integer>que=new LinkedList<>();
        push(4,que);
        push(9,que);
        push(2,que);
        top(que );
        pop(que);
        pop(que);
        push(1, que);
        top(que);

    }
    static void push(int element,Queue<Integer>q){
       int s=q.size();
       q.add(element);
       for(int i=1;i<s;i++){
        q.add(q.peek());
        q.remove();
       }

    }
    static void pop(Queue<Integer>q){
    q.remove();
    }
    static void top(Queue<Integer>q){
    System.out.println(q.peek());
    }
}
