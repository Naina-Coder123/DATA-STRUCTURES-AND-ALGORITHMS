public class ImplStackUsingLL {
    static int size = 0;
    static Node top = null;

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
        temp.next = top;
        top = temp;
        size++;
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        size--;
    }

    static void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(top.val);
        }
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
