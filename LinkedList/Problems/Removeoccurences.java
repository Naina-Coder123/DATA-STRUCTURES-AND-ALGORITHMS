/* Definition of doubly linked list: */

import java.util.HashSet;
import java.util.LinkedHashSet;

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
    public ListNode removeDuplicates(ListNode head) {
        // Implementation goes here
        if(head==null|| head.next==null){
            return head;
        }
        //bruteforcce
        ListNode temp=head;
        // ListNode ptr=null;
        // ListNode cpt=null;
        // ListNode back=null;
        // while(temp!=null){
        //     ptr=temp.next;
        //     while(ptr!=null){
        //         cpt=ptr.next;back=ptr.prev;
        //         if(temp.val==ptr.val){
        //             back.next=ptr.next;
        //             if(ptr.next!=null)
        //             ptr.next.prev=back;
        //             ptr.next=null;
        //             ptr.prev=null;

        //         }
        //         ptr=cpt;

        //     }
        //     temp=temp.next;
        // }
        //better
        // LinkedHashSet<Integer> s=new LinkedHashSet<>();
        // while(temp!=null){
        //     s.add(temp.val);
        //     temp=temp.next;
        // }
        // ListNode cpt=null;
        // temp=head;
        // for(int num:s){
        //     temp.val=num;
        //     cpt=temp;
        //     temp=temp.next;

        // }
        // if(cpt!=null)
        // cpt.next=null;
        ListNode ptr=null;
        while(temp!=null && temp.next!=null){
            ptr=temp.next;
            while(ptr!=null){
                if(temp.val!=ptr.val){
                    temp=ptr;
                    break;
                }
                else{
                    temp.next=ptr.next;
                    if(ptr.next!=null){
                        ptr.next.prev=temp;
                    }
                    ptr=ptr.next;

                }
            }
        }
        

        return head;
    }
}

public class Removeoccurences {
    public static void main(String[] args) {
        // Creating a sample doubly linked list: 1 <-> 2 <-> 2 <-> 3 <-> 3 <-> 4
        ListNode head = new ListNode(1);
        ListNode node2a = new ListNode(2);
        ListNode node2b = new ListNode(2);
        ListNode node3a = new ListNode(3);
        ListNode node3b = new ListNode(3);
        ListNode node4 = new ListNode(4 );

        head.next = node2a;
        node2a.prev = head;

        node2a.next = node2b;
        node2b.prev = node2a;

        node2b.next = node3a;
        node3a.prev = node2b;

        node3a.next = node3b;
        node3b.prev = node3a;

        node3b.next = node4;
        node4.prev = node3b;

        // Removing duplicates
        Solution sol = new Solution();
        ListNode newHead = sol.removeDuplicates(head);

        // Printing the modified list
        printList(newHead);
    }

    // Helper method to print the doubly linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
