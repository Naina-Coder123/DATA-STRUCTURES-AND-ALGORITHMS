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
public class InsertionMID {
    public static void main(String[] args) {
        int[] arr={2,3,5,6};
        Node head=convertAtoLL(arr);
        int element=4;
        Node temp=new  Node(element);
        int ele=3;
        Node ptr=head;
        while(ele!=ptr.data){
            ptr=ptr.next;

        }
        temp.next=ptr.next;
        ptr.next=temp;
       traversal(head);
        // System.out.println(head.data);
    }
    static void traversal(Node head){
        Node cpt=head;
        while(cpt!=null){
            System.out.println(cpt.data);
            cpt=cpt.next;
        }

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
