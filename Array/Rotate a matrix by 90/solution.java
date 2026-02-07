public class solution {
    public static int[][] rotateImage(int[][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               int temp=matrix[i][j];
               matrix[i][j]=matrix[i][n-j-1];
               matrix[i][n-j-1]=temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
               int temp=matrix[i][j];
               matrix[i][j]=matrix[n-j-1][i];
               matrix[n-j-1][i]=temp;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Original matrix:" + java.util.Arrays.deepToString(matrix));
        System.out.println("Rotated matrix:" + java.util.Arrays.deepToString(rotateImage(matrix)));
    }
}
