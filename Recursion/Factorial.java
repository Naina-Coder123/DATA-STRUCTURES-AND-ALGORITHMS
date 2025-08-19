public class Factorial {
    public static void main(String[] args) {
        f(5,1);
       System.out.println(fun(6));
    }
    //PARAMETERISED RECURSION
    static int f(int n,int mul){
        if(n==1){
            System.out.println(mul);
            return 1;
        }
       return f(n-1,mul*n);
    }
    //functionality recursion
    static int fun(int n){
        if(n==1){
            return 1;

        }
        return n*fun(n-1);
    }
}
