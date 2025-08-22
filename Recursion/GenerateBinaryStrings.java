import java.util.Scanner;
import java.util.ArrayList;
class GenerateBinaryStrings{
     public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    ArrayList<Character>list=new ArrayList<>();
    f(0,list,n);

        
    }
    static void f(int i,ArrayList<Character>l,int n){
        if(i==n){
            System.out.println(l);
            return;
        }
        l.add('0');
        f(i+1,l,n);
        l.remove(l.size()-1);
        l.add('1');
        f(i+1,l,n);
        l.remove(l.size()-1);

    }
}