class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;

    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }

};
public class Convert {


public static Node convertAtoLL(int[] arr) {
    Node head = new Node(arr[0]);
    Node ptr = head;
    for (int i = 1; i < arr.length; i++) {
        Node temp = new Node(arr[i]);
        ptr.next = temp;
        ptr = temp;
    }
    return head;
}

    public static void main(String[] args) {
        int[] arr = { 12, 1, 3, 8 };
        Node head = convertAtoLL(arr);
        System.out.println(head.data);
    }

}