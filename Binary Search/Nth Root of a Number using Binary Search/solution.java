public class solution {
public static int nthRoot(int n, int m) {
        int result=-1;
        //brute force approach
        // for(int i=1;i<=m;i++)
        // {
        //     if(Math.pow(i,n)==m)
        //     {
        //         result=i;
        //         break;
        //     }
        //     else if(Math.pow(i,n)>m)
        //     {
        //         break;
        //     }
        // }


        //optimal approach
        int low=1,high=m;
        while(low<=high)
        {
            
        }
        return result;
    }


    public static void main(String[] args) {
        int n = 3, m = 27;

        // Find nth root
        System.out.println("Nth Root: " + nthRoot(n, m));
    }    
}
