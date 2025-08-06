package SinglyLL;
class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class InsertionBeg {
    public static void main(String[] args) {
        int[] arr={2,3,5,6};
        Node head=convertAtoLL(arr);
        int element=9;
        Node temp=new  Node(element);
        temp.next=head;
        head=temp;
        System.out.println(head.data);
    }
    static Node convertAtoLL(int[] arr){
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
