package SinglyLL;
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }

};
public class Taversal {
    public static void main(String[] args) {
        int[] arr={2,7,6,9};
        Node head=convertAtoLL(arr);
        // System.out.println(head.data);
        //TRAVERSAL OF A LINKEDLIST
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;

        }
        int length=lengthOfLL(head);
        System.out.println("Length of a LinkedList"+ length);
        System.out.println(search(head, 6));
    }
    static boolean search(Node head,int element){
            Node ptr=head;
           while(ptr!=null){
            if(ptr.data==element)return true;
            ptr=ptr.next;
           }
           return false;


    }
    //length of a LinkedList
   static  int lengthOfLL(Node head){
        int count=0;
         Node temp=head;
        while(temp!=null){
            // System.out.print(temp.data+ " ");
            count++;
            temp=temp.next;

        }
        return count;

    }
    public static Node convertAtoLL(int[] arr){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node ptr=new Node(arr[i]);
            temp.next=ptr;
            temp=ptr;

        }
        return head;

    }
}
