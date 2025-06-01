import java.util.*;
public class DivisibleandNondivisible {
    public static void main(String[] args) {
    
    int n=10;
    int m=3;
      int sum1=0;
        int sum2=0;
        //bruteforce
        // for(int i=1;i<=n;i++){
        //     if(i%m==0){
        //         sum1+=i;
        //     }
        // }
        // for(int i=1;i<=n;i++){
        //     if(i%m!=0){
        //         sum2+=i;
        //     }
        // }
        //better

        for(int i=1;i<=n;i++){
            if(i%m==0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        System.out.println(sum2-sum1);
    }
}
