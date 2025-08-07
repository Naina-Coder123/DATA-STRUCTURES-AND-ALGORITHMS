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

public class InsertionbeforeTail {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1 };
        Node head = convert(arr);
        Node newHead = insertbeforeTail(head);
        print(head);
    }

    static Node insertbeforeTail(Node head) {
       Node ptr=head;
       Node cpt=null;
       while(ptr.next!=null){
        cpt=ptr;
        ptr=ptr.next;

       }
       Node temp=new Node(9);
       temp.next=ptr;
       temp.back=cpt;
       cpt.next=temp;
       ptr.back=temp;
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
