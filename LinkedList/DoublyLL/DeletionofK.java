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

class DeletionofK {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1 };
        Node head = convert(arr);
        print(head);
        Node newHEAD = deleteKth(head, 4);
        System.err.println();
        print(newHEAD);

    }

    static Node deleteHead(Node head) {
        Node ptr = head;
        head = ptr.next;
        ptr = null;
        return head;
    }

    static Node deleteTail(Node head) {
        Node ptr = head;
        if (head == null || head.next == null) {
            return null;
        }
        Node cpt = null;
        while (ptr.next != null) {
            cpt = ptr;
            ptr = ptr.next;

        }
        cpt.next = null;
        ptr.back = null;
        return head;

    }

    static Node deleteKth(Node head, int k) {
        Node ptr = head;
        int c = 0;
        while (ptr != null) {
            c++;
            if (c == k)
                break;
            ptr = ptr.next;
        }
        Node prev = ptr.back;
        Node front = ptr.next;

        // handling edge cases
        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            return deleteHead(head);
        } else if (front == null) {
            return deleteTail(head);
        } else {
            prev.next = front;
            front.back = prev;
            ptr.next = null;
            ptr.back = null;
        }
        return head;

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
            ;
        }
    }

}