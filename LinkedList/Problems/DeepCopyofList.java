
// Definition for a Node.

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;

        this.next = null;
        this.random = null;
    }
}

class DeepCopyofList {
    public static void main(String[] args) {
        // Create original list: 1 -> 2 -> 3
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        // Set random pointers
        node1.random = node3; // 1 -> 3
        node2.random = node1; // 2 -> 1
        node3.random = node3; // 3 -> 3

        // Create DeepCopyofList object and copy the list
        DeepCopyofList obj = new DeepCopyofList();
        Node copiedHead = obj.copyRandomList(node1);

        // Print original list
        System.out.println("Original List:");
        printList(node1);

        // Print copied list
        System.out.println("Copied List:");
        printList(copiedHead);
    }

    // Helper method to print a linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            int randomVal = temp.random != null ? temp.random.val : -1;
            System.out.println("Node val: " + temp.val + ", Random points to: " + randomVal);
            temp = temp.next;
        }
    }

    public Node copyRandomList(Node head) {
        // Bruteforce //time complexity O(N^2)
        // Node curr = head;
        // Node newHead = new Node(-1);
        // Node ptr = newHead;
        // while (curr != null) {
        // Node temp = new Node(curr.val);
        // ptr.next = temp;
        // curr = curr.next;
        // ptr = ptr.next;
        // }
        // newHead = newHead.next;
        // // System.out.println(newHead.val);
        // Node p = newHead;
        // Node cpt = head;
        // while (cpt != null) {
        // if (cpt.random != null) {
        // Node x = cpt.random;
        // Node nh = newHead;
        // while (nh != null) {
        // if (nh.val == x.val) {
        // p.random = nh;
        // break;
        // } else
        // nh = nh.next;
        // }
        // cpt = cpt.next;
        // p = p.next;
        // }
        // }

        // better Time Complexity-O(N) and space complexity-O(N)

        // Node newHead = new Node(-1);
        // Node ptr = newHead;
        // Node curr = head;
        // Map<Node, Node> mp = new HashMap<>();
        // while (curr != null) {
        // Node temp = new Node(curr.val);
        // ptr.next = temp;
        // mp.put(curr, temp);
        // curr = curr.next;
        // ptr = ptr.next;

        // }
        // newHead = newHead.next;
        // curr = head;
        // while (curr != null) {
        // if (curr.random != null) {
        // Node x = curr.random;
        // Node y = mp.get(curr);
        // y.random = mp.get(x);

        // }
        // curr = curr.next;

        // }
        // Optimised

        // Using three steps
        // 1.Copying
        // 2.Setting the random variable
        // 3.Extract the list

        // copy
        Node curr = head;
        while (curr != null) {
            Node temp = new Node(curr.val);
            temp.next = curr.next;
            curr.next = temp;
            curr = temp.next;
        }
        // set
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                Node x = curr.random;
                curr.next.random = x.next;

            }
            curr = curr.next.next;
        }
        // extract
        Node newHead = new Node(-1);
        curr = head;
        Node ptr = newHead;
        while (curr != null) {
            ptr.next = curr.next;
            curr.next = curr.next.next;
            curr = curr.next;
            ptr = ptr.next;
        }

        return newHead.next;
    }
}