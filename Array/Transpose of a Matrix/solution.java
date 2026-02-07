import java.util.Arrays;

public class solution {
    public static void swap(int[][]matrix,int i,int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
    public static int[][] transpose(int[][] matrix) {
       int rows=matrix.length;
       int cols=matrix[0].length;

       //diagonal elements will remain same
       //why j=i+1 because we have to swap only upper triangle elements with lower triangle elements
       //if not then So each element gets swapped twice, canceling the transpose.
       for(int i=0;i<rows;i++){
        for(int j=i+1;j<cols;j++){
          swap(matrix,i,j);
        }
       }
       return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Original matrix:" + Arrays.deepToString(matrix));
        System.out.println("Transposed matrix:" + Arrays.deepToString(transpose(matrix)));
    }
}
