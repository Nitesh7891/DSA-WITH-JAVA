public class Solution{
    public static int sqrt(int n)
    {
        //Brute force approach
        // int result=0;
        // for(int i=0;i<=n;i++)
        // {
        //     if(i*i<=n)
        //        result=i;
        //     else
        //          break;    
        // }
        // return result;

        //optimal solution
        if(n<2) return n;
        int result=0;
        int low=1,high=n/2;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(mid*mid<=n)
            {
                result=(int)mid;
                low=(int)mid+1;
                
            }
            else high=(int)mid-1;
        }
        return result;
    }
    public static void main(String[] args)
    {
        int n=2147483647;
        System.out.println("The square root of "+n+" equals to "+sqrt(n));
    }
}