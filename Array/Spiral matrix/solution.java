import java.util.*;

public class solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
       List<Integer> result=new ArrayList<>();

       int top=0,left=0,right=cols-1,bottom=rows-1;

       //loop until top does not meet bottom and left does not meet right because we have to traverse the matrix in spiral order
       while(top<=bottom && left<=right){
        //traverse from left to right
        //top is incremented so not to add that element again in next iteration
        for(int i=left;i<=right;i++){
          result.add(matrix[top][i]);
        }
        top++;

        //traverse from top to bottom
         //right is decremented so not to add that element again in next iteration
        for(int j=top;j<=bottom;j++){
          result.add(matrix[j][right]);
        }
        right--;

        //traverse from right to left
         //bottom is decremented so not to add that element again in next iteration
        for(int k=right;k>=left;k--){
        result.add(matrix[bottom][k]);
        }
        bottom--;

        //traverse from bottom to top
        // //left is incremented so not to add that element again in next iteration
        for(int l=bottom;l>=top;l--){
        result.add(matrix[l][left]);
        }
        left++;
       }

       return result;

    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    System.out.println("Original matrix:" + Arrays.deepToString(matrix));
    System.out.println("Spiral order:" +Arrays.toString(spiralOrder(matrix).toArray()));

    }
}
