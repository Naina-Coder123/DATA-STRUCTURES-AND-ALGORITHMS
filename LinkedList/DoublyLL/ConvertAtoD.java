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

public class ConvertAtoD {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4 };
        Node head = convertArraytoDD(arr);
        System.out.println(head.data);
        printDD(head);

    }

    static Node convertArraytoDD(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            temp.back = prev;
            prev = temp;

        }
        return head;

    }

    static void printDD(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }

    }

}
