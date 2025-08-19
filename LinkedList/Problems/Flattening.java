// Definition for singly Linked List

import java.util.ArrayList;
import java.util.Collections;

class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}

class Solution {
    public ListNode flattenLinkedList(ListNode head) {
        // Logic to flatten the linked list will go here
        //bruteforce
        // ListNode temp=null;
        // ArrayList<Integer>list=new ArrayList<>();
        // while(head!=null){
        //     temp=head;
        //     while(temp!=null){
        //         list.add(temp.val);
        //         temp=temp.child;
        //     }
        //     head=head.next;

        // }
        // Collections.sort(list);
        // System.out.println(list);
        // ListNode newHead=new ListNode(-1);
        // ListNode ptr=newHead;
        // for(int num:list){
        //     ListNode tempo=new ListNode(num);
        //     ptr.next=tempo;
        //     ptr=ptr.next;

        // }
        // return newHead.next;
        //optimise
        + 


































































































































































































































































































































































































































































































































        
    }
}

public class Flattening {
    public static void main(String[] args) {
        // Create example linked list with child pointers
        ListNode head = new ListNode(5);
        head.child = new ListNode(7);
        head.child.child = new ListNode(8);
        head.child.child.child = new ListNode(30);

        head.next = new ListNode(10);
        head.next.child = new ListNode(20);

        head.next.next = new ListNode(19);
        head.next.next.child = new ListNode(22);
        head.next.next.child.child = new ListNode(50);

        head.next.next.next = new ListNode(28);
        head.next.next.next.child = new ListNode(35);
        head.next.next.next.child.child = new ListNode(40);
        head.next.next.next.child.child.child = new ListNode(45);

        Solution sol = new Solution();
        ListNode flatHead = sol.flattenLinkedList(head);

        // Print flattened list
        while (flatHead != null) {
            System.out.print(flatHead.val + " ");
            flatHead = flatHead.child; // assuming flattening happens via child pointer
        }
    }
}
