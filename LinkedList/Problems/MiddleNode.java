
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class MiddleNode {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 }; // test with even or odd length
        ListNode head = convertAtoLL(arr);

        ListNode middle = middleNode(head);
        if (middle != null) {
            System.out.println("Middle node value: " + middle.val);
        } else {
            System.out.println("List is empty.");
        }
    }

    static ListNode convertAtoLL(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode ptr = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            ptr.next = temp;
            ptr = temp;
        }
        return head;
    }

    public static ListNode middleNode(ListNode head) {
        // int c = 0;
        // ListNode temp = head;

        // if (head == null || head.next == null) {
        //     return head;
        // }

        // // Count number of nodes
        // while (temp != null) {
        //     c++;
        //     temp = temp.next;
        // }

        // // Move to the middle node (second middle if even number of nodes)
        // int k = c / 2;
        // temp = head;
        // for (int i = 0; i < k; i++) {
        //     temp = temp.next;
        // }

        // return temp;


        //Implementing the tortoise hare method

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
