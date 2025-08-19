public class Substrings{
    public static void main(String[] args){
        String s="abcd";
       System.out.println( countSubstrings(s));
       printSubstrings(s);
    }
    static int countSubstrings(String str){
        int n=str.length();
        return (n*(n+1))/2;

    }
    static void printSubstrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                for(int k=i;k<=j;k++){
                    System.out.print(str.charAt(k));
                }
                    System.out.println();

            }
        }
    }
}
