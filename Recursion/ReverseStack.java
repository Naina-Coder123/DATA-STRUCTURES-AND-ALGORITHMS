import java.util.Scanner;
import java.util.Stack;
class ReverseStack{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Stack<Integer>s=new Stack<>();
        int n=scn.nextInt();

        for(int i=0;i<n;i++){
            s.push(scn.nextInt());
        }
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
    static void reverse(Stack<Integer>s){
       if(s.isEmpty()){
        return;
       }
       int temp=s.pop();
       reverse(s);
       insert(temp,s);
    }
    static void insert(int temp,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(temp);
            return;
        }
        int a=s.pop();
        insert(temp, s);
        s.push(a);
    }
}