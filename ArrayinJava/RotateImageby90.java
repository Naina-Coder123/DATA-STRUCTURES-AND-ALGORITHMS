public class RotateImageby90 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
            int n=matrix.length;
        //  int[][] m=new int[n][n];
        //  for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         m[j][n-i-1]=matrix[i][j];
        //     }
           
        //  }
        //  for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         matrix[i][j]=m[i][j];
        //     }
        //  }

          //optimal
        //1.transpose
        //2.reverse
        for(int i=0;i<n;i++){
            //skipping the redudant swaps
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //2.
        for(int i=0;i<n;i++){
            int k=matrix[i].length-1;
            int j=0;
            while(j<k){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;k--;
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }
        }
}
