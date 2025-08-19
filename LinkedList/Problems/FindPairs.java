import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class Solution {
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        // Your code goes here
        ListNode temp = head;
        // ListNode ptr=temp.next;
        List<List<Integer>> l = new ArrayList<>();
        // while(temp!=null){
        // ptr=temp.next;

        // while(ptr!=null){
        // if(temp.val+ptr.val==target){
        // List<Integer>list=Arrays.asList(temp.val,ptr.val);
        // if(l.contains(list)){
        // continue;
        // }
        // l.add(list);
        // }
        // ptr=ptr.next;
        // }
        // temp=temp.next;
        // }
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        while (temp!=null  &&   ptr!=null && temp!=ptr.next ){
            int sum = temp.val + ptr.val;
            if (sum == target) {
                List<Integer> list = Arrays.asList(temp.val, ptr.val);
                Collections.sort(list);
                if (!l.contains(list)) {
                    l.add(list);
                }
                temp=temp.next;
                ptr=ptr.prev;

            } else if (sum > target) {
                ptr = ptr.prev;

            } else {
                temp = temp.next;
            }

        }

        return l; // placeholder return
    }
}

public class FindPairs {
    public static void main(String[] args) {
        // Create a sample doubly linked list: 1 <-> 2 <-> 3 <-> 4 <-> 5
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);       
         ListNode node5 = new ListNode(6);
     ListNode node6 = new ListNode(8);

     ListNode node7 = new ListNode(9);


        head.next = node2; node2.prev = head;
        node2.next = node3; node3.prev = node2;
        node3.next = node4; node4.prev = node3;
        node4.next = node5; node5.prev = node4;
        node5.next=node6; node6.prev=node5;
        node6.next=node7;node7.prev=node6;



        // Call the method (currently unimplemented)
        Solution finder = new Solution();
        int target = 6;
        List<List<Integer>> pairs = finder.findPairsWithGivenSum(head, target);

        // Display result
        System.out.println("Pairs with sum " + target + ": " + pairs);
    }
}
