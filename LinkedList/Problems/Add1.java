//Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}


class Solution {
    public ListNode addOne(ListNode head) {
        ListNode newhead = reverse(head);
        ListNode temp = newhead;
        int carry = 1;
        ListNode cpt = null;

        while (temp != null) {
            int x = carry + temp.val;
            carry = x / 10;
            if (carry == 1) {
                temp.val = x%10;
                cpt = temp;
                temp = temp.next;
            } else {
                temp.val = x;
                break;
            }
        }

        if (carry == 1) {
            ListNode curr = new ListNode(carry);
            cpt.next = curr;
        }

        ListNode rev = reverse(newhead);
        return rev;
    }

    ListNode reverse(ListNode head) {
        ListNode rand = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode f = temp.next;
            temp.next = rand;
            rand = temp;
            temp = f;
        }
        return rand;
    }
}

// Main function in class add1
public class Add1 {
    public static void main(String[] args) {
        // Create linked list: 1 -> 9 -> 9
        ListNode head = new ListNode(1, new ListNode(9, new ListNode(9)));

        Solution sol = new Solution();
        head = sol.addOne(head);

        // Print updated linked list
        printList(head);
    }

    private static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }
}
