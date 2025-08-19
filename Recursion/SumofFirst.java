public class SumofFirst {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    //here i am using the sunctionality recursion in this i am breaking the problem into subparts and solvind the problem in this what i am doing that f(5)->5+f(4)->5+4+f(3)->5+4+3+f(2)->5+4+3+2+f(1)->5+4+3+2+1+f(0) and then returning back and back
    static int f(int n){
        if(n==0){
            return 0;
        }
        return n+f(n-1);
    }
}
