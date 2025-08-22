import java.util.Stack;
class ValidParenthesis{
    public static void main(String[] args) {
        String s="))";
        System.out.println( validParenthesis(s));
    }
    static boolean validParenthesis(String s){
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
       int i=0;
       while(i<s.length()){
        if(s.charAt(i)=='('){
            count++;
        }
        else if(s.charAt(i)==')'){
            count--;
        }
        i++;
       }
       if(count!=0){
        return false;
       }
       return true;


    }
}