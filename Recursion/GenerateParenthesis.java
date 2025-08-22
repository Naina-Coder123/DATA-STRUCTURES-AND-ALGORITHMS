import java.util.ArrayList;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n=3;
        int l=n*2;
        ArrayList<StringBuilder>list=new ArrayList<>();
        StringBuilder result=new StringBuilder();
        result.append('(');

            generateParenthesis(l,list,result,1);
        System.out.println(list);
    }
   static void generateParenthesis(int l,ArrayList<StringBuilder>list,StringBuilder result,int i){
    if(i==l){
        if(validParenthesis(result)){
           list.add(new StringBuilder(result));
        }
        return;

    }
    result.append('(');
    generateParenthesis(l, list, result, i+1);

    result.deleteCharAt(result.length()-1);
    result.append(')');
    generateParenthesis(l, list, result, i+1);
    result.deleteCharAt(result.length()-1);

    }
     static boolean validParenthesis(StringBuilder s){
        //using stack
        // StringBuilder str=new StringBuilder(s);
        // Stack<Character>stack=new Stack<>();

        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='('){
        //         stack.push('(');
        //         str.deleteCharAt(i);

        //     }
        //     if(str.charAt(i)==')'){
        //         if(!stack.isEmpty()){
        //         stack.pop();
        //         str.deleteCharAt(i);
        //         }
        //     }

        // }
        // if(!stack.isEmpty() || !str.isEmpty()){
        //     return false;
        // }
        // return true;

        //using counter variable
       int count=0;
       for(int i=0;i<s.length();i++){
        char str=s.charAt(i);
        if(str=='('){
            count++;
        }
         if(str==')'){

            count--;
            if(count<0)return false;
        }
       }
       if(count<0)
        return false;
       
       return count == 0;


    }
}
