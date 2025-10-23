// for constant sliding window with two pointer

public class solution {

    public static void printSum(int[] arr,int k)
    {
        int n=arr.length;
        int l=1,r=k,sum=0;
       for(int i=0;i<k;i++)
        sum+=arr[i];
         System.out.println("Sum of "+k+" contiguous elements from index "+(l)+" to "+(r)+" is: "+sum);
          
        while(r<n)
        {
            sum=sum-arr[l-1]+arr[r];
             l++;
             r++;
             System.out.println("Sum of "+k+" contiguous elements from index "+(l)+" to "+(r)+" is: "+sum);
            
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int k=4;
        printSum(arr,k);
    }
}
