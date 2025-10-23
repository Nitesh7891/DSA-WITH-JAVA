// package Sliding Window &Two pointer.Maximum point you can obtain from cards;

public class solution {
    public static int maxScore(int[] arr,int k)
    {
        //brute force approach
        // int maxSum=0;
        // for(int i=0;i<=k;i++)
        // {
        //     int tempSum=0;
        //     for(int j=0;j<i;j++)
        //     {
        //          tempSum+=arr[j];
        //     }

        //     for(int j=0;j<k-i;j++)
        //     {
        //         tempSum+=arr[arr.length-1-j];
        //     }

        //     maxSum=Math.max(maxSum,tempSum);
        // }
        // return maxSum;



        //optimal approach
        int totalSum=0;

        for(int i=0;i<k;i++)
        totalSum+=arr[i];

        int maxSum=totalSum;

        for(int i=0;i<k;i++)
        {
           totalSum=totalSum-arr[k-1-i];


           totalSum=totalSum+arr[arr.length-1-i];


           maxSum=Math.max(maxSum,totalSum);
        }

        return maxSum;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,1,2,3};
        int k=3;
        System.out.println(maxScore(arr, k));
    }
}
