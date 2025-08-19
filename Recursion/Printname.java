public class Printname {
    public static void main(String[] args) {
        print();
    }
    static int cnt=0;
    static void print(){
        if(cnt==5){
            return;
        }//base condition
        System.out.println("Naina");
        cnt++;//counter increment

        print();//again function call
    }
}
