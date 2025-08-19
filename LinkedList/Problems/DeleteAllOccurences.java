//Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}

class Solution {
    public ListNode deleteAllOccurrences(ListNode head, int target) {
        // your implementation goes here
        if(head==null){
            return head;
        }
        ListNode temp=head;
        while(temp!=null){
            ListNode pre=temp.prev;
            ListNode front=temp.next;
            if(temp.val==target){
              if(pre!=null)
                pre.next=front;
                else
                head=front;
                 if(front!=null)
                front.prev=pre;
                temp.next=null;
                temp.prev=null;
            }
            temp=front;

        }
        temp=head;
        return head;
    }
}

public class DeleteAllOccurences {
    public static void main(String[] args) {
        // Create doubly linked list: 1 <-> 2 <-> 3 <-> 2 <-> 4
        ListNode head = new ListNode(2);
        ListNode node2a = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node2b = new ListNode(2);
        ListNode node4 = new ListNode(2);

        head.next = node2a;
        node2a.prev = head;
        node2a.next = node3;

        node3.prev = node2a;
        node3.next = node2b;

        node2b.prev = node3;
        node2b.next = node4;

        node4.prev = node2b;

        int target = 2;

        Solution sol = new Solution();
        head = sol.deleteAllOccurrences(head, target);

        // Print updated list
        printList(head);
    }

    private static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null)
                System.out.print(" <-> ");
            curr = curr.next;
        }
        System.out.println();
    }
}
