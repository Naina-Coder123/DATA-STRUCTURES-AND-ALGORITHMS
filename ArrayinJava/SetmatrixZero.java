public class SetmatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
          int m=matrix.length;
        int n=matrix[0].length;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(matrix[i][j]==0){
//                     markRow(matrix,i);
//                     markCol(matrix,j);
//                 }
//             }
//         }
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(matrix[i][j]==-1){
//                     matrix[i][j]=0;
//                 }

//             }
//         }
//better

//  int[] row=new int[n];
   
//    int[] col=new int[m];
   
//    for(int i=0;i<m;i++){
//     for(int j=0;j<n;j++){
//         if(matrix[i][j]==0){
//             col[i]=1;
//             row[j]=1;
//         }
//     }

//    }
//    for(int i=0;i<m;i++){
//     for(int j=0;j<n;j++){
//         if(col[i]==1||row[j]==1){
//             matrix[i][j]=0;
//         }
//     }
//    }


  //optimal
        //int row[0]=matrix[..][0]
        //int col[0]=matrix[0][..]
        int col0=1;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0){
                        matrix[0][j]=0;

                    }else{
                        col0=0;
                    }
                }
            }
        }
        //inner matrix
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }

            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }


        
    }
//    static void markRow(int[][] matrix,int i){
    // int n=matrix[0].length;
    //     for(int j=0;j<n;j++){
    //         if(matrix[i][j]!=0){
    //             matrix[i][j]=-1;
    //         }
    //     }
    // }
    //  static void markCol(int[][] matrix,int j){
    //     int m=matrix.length;
    //     for(int i=0;i<m;i++){
    //         if(matrix[i][j]!=0){
    //             matrix[i][j]=-1;
    //         }
    //     }
    // }
}

    
    

