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
}
public class DeletionMid {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Node head=convertAtoLL(arr);
        // System.out.println(head.data);
      int element=3;
      Node ptr=head;
      Node cpt=null;
      while(ptr.data!=element){
        cpt=ptr;
        ptr=ptr.next;

      }
      cpt.next=ptr.next;
      ptr=null;
      printLinked(head);
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
         static void  printLinked(Node head){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+ " ");
            ptr=ptr.next;
        }
      }


}
