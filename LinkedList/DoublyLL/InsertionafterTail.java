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

public class InsertionafterTail {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1 };
        Node head = convert(arr);
        Node newHead = insertafterTail(head);
        print(head);
    }

    static Node insertafterTail(Node head) {
     Node ptr=head;
     while(ptr.next!=null){
        ptr=ptr.next;
     }
     Node temp=new Node(10);
     ptr.next=temp;
     temp.back=ptr;
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
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
