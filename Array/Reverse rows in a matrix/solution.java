import java.util.*;

public class solution {
    public static int[][] reverseRows(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols/2;j++){
           int temp=matrix[i][j];
           matrix[i][j]=matrix[i][cols-j-1];
           matrix[i][cols-j-1]=temp;
            }
        }
        return matrix;
       
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Original matrix:" + Arrays.deepToString(matrix));
        System.out.println("Reversed row matrix:" + Arrays.deepToString(reverseRows(matrix)));
    }
}
