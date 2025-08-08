class ListNode {
    int val;
    ListNode next;

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
    public ListNode sortList(ListNode head) {
        // Sorting logic will go here
//   ListNode temp=head;
//         int zero=0;
//          int one=0;
//          int two=0;
//         while(temp!=null){
//             if(temp.val==0)zero++;
//             else if(temp.val==1)one++;
//             else two++;
//             temp=temp.next;
//         }
//         temp=head;
//         while(temp!=null){
//             while(zero>0){
//                 temp.val=0;
//                 temp=temp.next;
//                 zero--;
//             }
//              while(one>0){
//                 temp.val=1;
//                 temp=temp.next;
//                 one--;
//             }
//              while(two>0){
//                 temp.val=2;
//                 temp=temp.next;
//                 two--;
//             }
//         }
        //optimise
        if(head==null || head.next==null){
            return head;
    }
        ListNode temp=head;
        ListNode dzero=new ListNode(-1);
        ListNode done=new ListNode(-1);
        ListNode dtwo=new ListNode(-1);
         ListNode zero=dzero;
        ListNode one=done;
        ListNode two=dtwo;
        while(temp!=null){
            if(temp.val==0){
                zero.next=temp;
                zero=temp;
            }
            else if(temp.val==1){
                one.next=temp;
                one=temp;
            }
            else{
                two.next=temp;
                two=temp;
            }
            temp=temp.next;


        }
       zero.next=(done.next!=null)?(done.next):(dtwo.next);
    one.next=(dtwo.next!=null)?(dtwo.next):(null);
    two.next=null;
    dzero=dzero.next;
    //time comlexity nearly O(n)
    //space comlexity O(1);




        
        
        
        
        return dzero; // temporary return
    }
}

public class Main {
    public static void main(String[] args) {
        // Create linked list: 4 -> 2 -> 1 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(0);
                head.next.next.next.next = new ListNode(1);


        // Print original list
        System.out.println("Original list:");
        printList(head);

        // Call sortList
        Solution sol = new Solution();
        ListNode sortedHead = sol.sortList(head);

        // Print sorted list (will be same until you implement sortList)
        System.out.println("Sorted list:");
        printList(sortedHead);
    }
     

    // Utility method to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
