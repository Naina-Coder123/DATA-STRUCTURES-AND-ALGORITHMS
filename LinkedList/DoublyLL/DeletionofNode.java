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

class DeletionofNode {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1 };
        Node head = convert(arr);
        deleteNode(head.next.next);
        print(head);

    }

    static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;

        }
        // deletion at end
        Node ptr = head;
        Node cpt = null;
        while (ptr.next != null) {
            cpt = ptr;
            ptr = ptr.next;

        }
        cpt.next = ptr;
        ptr.back = null;
        return head;

    }

    static void deleteNode(Node node) {
        Node prev = node.back;
        Node front = node.next;
        if (front == null) {
            // prev.next = null;
            // node.back = null;
            deleteTail(node);

        }
        prev.next = front;
        front.back = prev;
        node.next = null;
        node.back = null;

    }

    static Node convert(int[] arr) {
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

    static void print(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;

        }
    }

}