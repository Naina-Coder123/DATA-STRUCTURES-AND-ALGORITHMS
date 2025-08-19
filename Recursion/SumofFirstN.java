class SumofFirstN{
    public static void main(String[] args){
        f(5,0);
    }
    //here in this i am using the parameterised recursion in whinch i am passing the parameters
    static void f(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;

        }
        f(i-1,sum+i);
    }
}