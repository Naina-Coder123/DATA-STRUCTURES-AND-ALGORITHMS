public class PrintfromNto1 {
    public static void main(String[] args) {
        print(5);
        int num=7;
        for(int i=num;i>0;i--){
            System.out.println(i);;
        }
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        n--;
        print(n);
    }
}
