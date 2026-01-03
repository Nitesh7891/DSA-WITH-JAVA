import java.util.*;

public class solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle =new ArrayList<>();

       for(int i=0;i<numRows;i++)
       {
        List<Integer> row=new ArrayList<>();
        row.add(1);
        long ans=1;
        for(int j=1;j<=i;j++)
        {
            ans=ans*(i+1-j);
            ans=ans/j;
          row.add((int)ans);
        }
        triangle.add(row);
       }
       return triangle;
        
    }
    public static void main(String[] args) {
        solution obj = new solution();
        int n = 30;

        // Generate and print Pascal's Triangle
        List<List<Integer>> result = obj.generate(n);
        for (List<Integer> row : result) {
            for (Integer val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
