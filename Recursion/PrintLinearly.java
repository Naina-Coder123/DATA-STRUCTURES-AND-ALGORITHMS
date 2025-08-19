public class PrintLinearly {
    static int i=1;
    public static void main(String[] args) {
        print(5);

    }
    static void print(int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        i++;
        print(n);
    }
}
