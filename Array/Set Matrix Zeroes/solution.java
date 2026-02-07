import java.util.Arrays;

public class solution {
    public static int[][] setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;


        //Brute force approach
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (matrix[i][j] == 0) {
        //             for (int k = 0; k < m; k++) {
        //                 if (matrix[k][j] != 0) {
        //                     matrix[k][j] = -1;
        //                 }
        //             }

        //             for (int l = 0; l < n; l++) {
        //                 if (matrix[i][l] != 0) {
        //                     matrix[i][l] = -1;
        //                 }
        //             }
        //         }
        //     }
        // }

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (matrix[i][j] < 0) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
/*----------------------------------------------------------------------------------------------------------------- */
        //better approach
        // boolean[] rows=new boolean[m];
        // boolean[] cols=new boolean[n];

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j]==0){
        //             rows[i]=true;
        //             cols[j]=true;
        //         }
        //     }
        // }

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j]!=0)
        //         {
        //             if(rows[i] || cols[j]){
        //             matrix[i][j] = 0;
        //         }
        //     }
        //     }
        // }

/*------------------------------------------------------------------------------------------------------------------- */

       //optimal approach
       boolean firstRow=false;
       boolean firstCol=false;
       for(int i=0;i<m;i++){
        if(matrix[i][0]==0){
             firstCol=true;
            break;
        }
       }

       for(int j=0;j<n;j++){
        if(matrix[0][j]==0){
           firstRow=true;
            break;
        }
       }

       for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
            if(matrix[i][j]==0){
                matrix[0][j]=0;
                matrix[i][0]=0;
            }
        }
       }

       for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
            if(matrix[i][0]==0 || matrix[0][j]==0){
                matrix[i][j]=0;
            }
        }
       }

       if(firstCol){
        for(int i=0;i<m;i++){
            matrix[i][0]=0;
        }
    }

    if(firstRow){
        for(int j=0;j<n;j++){
            matrix[0][j]=0;
        }
    }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        System.out.println(Arrays.deepToString(setZeroes(matrix)));
    }

}