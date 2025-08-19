public class Countoccurences {
    public static void main(String[] args) {
        String s="aabbcccc";
        char ch='c';
        System.out.println(        count(ch,0,s)
);
    }
    static int count(char ch,int i,String s){
        int n=s.length()-1;
        if(i==n){
            return 1;
        }
        if(s.charAt(i)==ch){
            return 1+count(ch, i+1, s);
        }
        else
        return count(ch, i+1, s);
    }
    
}
