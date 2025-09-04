public class ImplQueueUsingLL {
  
    static int size = 0;
    static Node start=null;
    static Node end=null;

    public static void main(String[] args) {
        push(9);
        push(3);
        pop();
        push(1);
        push(7);
        peek();
        size();
        pop();
        size();
    }

    static void push(int element) {
        Node temp = new Node(element);
       if(start==null){
        start=end=temp;
       }
       else{
        end.next=temp;
       }
       size+=1;
    }

    static void pop() {
        if(start==null){
         System.out.println("Cannot pop!");
         return;
        }
        Node temp=start;
        start=start.next;
        size-=1;

    }

    static void peek() {
       if(start==null){
        System.out.println("Empty");
        return;
       }
       System.out.println(start.val);
    }

    static void size() {
        System.out.println(size);
    }
}

class Node {
    int val;
    Node next;

    Node(Node next, int val) {
        this.next = next;
        this.val = val;
    }

    Node(int val) {
        this.val = val;
    }
}


