public class solution {
    public static int[][] rotateImage(int[][] matrix){
        int n=matrix.length;
        
        //brute force approach
         //the main idea is to put the element in new array at position (j,n-i-1) because we are 
        // rotating the matrix in clockwise direction
        // int[][] rotated=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         rotated[j]n-i-1[]=matrix[i][j];
        //     }
        // }
        // return rotated;

        
        //optimal approach
        //transpose the matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
            }
        }

        //reverse all rows
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
               int temp=matrix[i][j];
               matrix[i][j]=matrix[i][n-j-1];
               matrix[i][n-j-1]=temp;
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


