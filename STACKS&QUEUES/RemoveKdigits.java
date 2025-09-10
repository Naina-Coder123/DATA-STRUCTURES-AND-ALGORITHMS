import java.util.Stack;

public class RemoveKdigits {
      public static void main(String[] args) {
        String num="10200";
        int k=1;
        String s=removeKdigits(num,k);
        System.out.println(s);
    }
    static public String removeKdigits(String num, int k) {

        Stack<Character>s=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!s.isEmpty() && num.charAt(i)-'0'<s.peek()-'0'&& k>0){
                k--;
                s.pop();
            }
            s.push(num.charAt(i));
        }
       while(k>0){
        s.pop();
        k--;
       }
       if(s.isEmpty()){
        return "0";
       }
      StringBuilder res=new StringBuilder();
      while(!s.isEmpty()){
        res.append(s.pop());

      }
      while(res.length()!=0 && res.charAt(res.length()-1)=='0'){
        res.deleteCharAt(res.length()-1);
      }
      res.reverse();
      if(res.length()==0){
        return "0";
      }else
        return res.toString();
    }

}
