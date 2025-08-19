public class PrintNto1Backtrack {
    public static void main(String[] args) {
        int n=5;
        int i=0;
        f(i,n);
    }
    static void f(int i,int n){
        if(i>n){
            return;
        }
        f(i+1,n);
        System.out.println(i);
    }
}
