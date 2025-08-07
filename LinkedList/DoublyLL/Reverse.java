import java.util.Stack;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = convert(arr);
        head= reverseList(head);
        print(head);

    }

    static Node reverseList(Node head) {
        // bruteforce
        // Node temp=head;
        // Stack<Integer>s=new Stack<>();
        // while(temp!=null){
        // s.push(temp.data);
        // temp=temp.next;
        // }
        // temp=head;
        // while(temp!=null){
        // temp.data=s.peek();
        // s.pop();
        // temp=temp.next;
        // }
        // better
        // Node temp=head;
        // Node ptr=head;
        // while(ptr.next!=null){
        // ptr=ptr.next;
        // }
        // while(ptr!=temp){
        // int x=temp.data;
        // temp.data=ptr.data;
        // ptr.data=x;
        // temp=temp.next;
        // ptr=ptr.back;

        // }

        // optimise one traversal only

        Node curr = head;
        Node last = null;
        if (head == null || head.next == null) {
            return head;
        }
        while (curr != null) {
            last = curr.back;
            curr.back = curr.next;
            curr.next = last;
            curr = curr.back;
        }

        if (last != null) {
            head = last.back;
        }

        return head;
    }

    static Node convert(int[] arr) {
        Node head = new Node(arr[0]);
        Node ptr = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            ptr.next = temp;
            temp.back = ptr;
            ptr = temp;
        }
        return head;
    }

    static void print(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }

    }
}