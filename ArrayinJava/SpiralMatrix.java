import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
          List<Integer>l=new ArrayList<>();
        //this question does not have a multiple solution only one solution so why
        //interviewer asked this question they want to know how well you implement and how clean your code is
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=m-1;
        while(left<=right && top<=bottom ){
            for(int i=left;i<=right;i++){
                l.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                l.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    l.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    l.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(l);
       // return l;
    }
}
