import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s="abbbcccdd";
//         StringBuilder str=new StringBuilder(s);
//         for(int i=0;i<str.length();i++){
//             for(int j=i+1;j<str.length();j++){
//                 if(str.charAt(i)!=str.charAt(j))break;
//                 if(str.charAt(i)==str.charAt(j)){
//                     str.deleteCharAt(j);
//                     j--;
//                 }
//             }
//         }
// System.out.println(str.toString());
//better
HashSet<Character>set=new HashSet<>();
for(int i=0;i<s.length();i++){
    set.add(s.charAt(i));
}
String str="";
for(char ch:set){
    str+=ch;
}
System.out.println(str);

    }
}
