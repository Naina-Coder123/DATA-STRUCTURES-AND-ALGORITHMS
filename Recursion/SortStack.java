import java.util.Stack;
import java.util.Scanner;
class SortStack{
    public static void main(String[] args){
        Stack<Integer>s=new Stack<>();
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            s.push(scn.nextInt());
        }
      
        System.out.println(s);
        sortStack(s);
     System.out.println(s);

    }
   static void sortStack(Stack<Integer>s){
        if(s.size()==1){
            return;
        }
        int temp=s.pop();
        sortStack(s);
        insert(temp,s);

    }
    static void insert(int temp,Stack<Integer>s){
        if(s.isEmpty()|| s.peek()>=temp){
            s.push(temp);
            return;

        }
        int a=s.pop();
        insert(temp, s);
        s.push(a);
    }
}