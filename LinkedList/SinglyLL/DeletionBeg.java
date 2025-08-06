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
}
public class DeletionBeg {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Node head=convertAtoLL(arr);
        // System.out.println(head.data);
        Node ptr=head;
        head=ptr.next;
        ptr=null;
        System.out.println(head.data);
        }
        static Node convertAtoLL(int[] arr){
            Node head=new Node(arr[0]);
            Node ptr=head;
            for(int i=1;i<arr.length;i++){
                Node temp=new Node(arr[i]);
                ptr.next=temp;
                ptr=temp;
            }
            return head;
        }

}
