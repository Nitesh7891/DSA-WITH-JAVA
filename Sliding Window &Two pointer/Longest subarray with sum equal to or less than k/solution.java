// import java.util.*;
public class solution {
  public static void longestSubarray(int[] arr,int k)
  {
      //brute force approach
      //     int maxLength=0;
          
      //    for(int i=0;i<arr.length;i++)
      //     {
      //         int sum=0;
      //        for(int j=i;j<arr.length;j++)
      //        {
      //          sum+=arr[j];
      //          if(sum<=k)
      //          {
      //           maxLength=Math.max(maxLength,(j-i+1));
      //          }
      //          else
      //          {
      //            break;
      //          }
      //        }
      //     }
      //     System.out.println(maxLength);


      // better solution
      // int sum=0,maxLength=0;
      // int i=0,j=0;
      // while(j<arr.length)
      // {
      //   while(sum>k)
      //   {
      //       sum-=arr[i];
      //       i++;
      //   }
      //  while(sum<=k&&j<arr.length)
      //  {
      //     sum+=arr[j];
      //     maxLength=Math.max(maxLength,(j-i+1));
      //     j++;
      //  }
    
      // }

    
}  
    


    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,3,2,1,1,1};
        int k=20;
        longestSubarray(arr,k);
    }
}
