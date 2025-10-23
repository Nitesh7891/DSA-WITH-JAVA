
public class solution {
  public static int binarySubarraySum(int[] arr,int goal)
  {
    // //Brute  force approach
    // int count=0;
    // for(int i=0;i<arr.length;i++)
    // {
    //   int sum=0;
    //   for(int j=i;j<arr.length;j++)
    //   {
    //     sum+=arr[j];
    //      if(sum==goal) {
    //       count++;
    //     }
    //   }
     
    // }
    // return count;

   return atMostGoal(arr,goal)-atMostGoal(arr,goal-1);
  }

  public static int atMostGoal(int[] arr, int goal) {
    int count=0;
    int left=0;
    int sum=0;
    for(int right=0;right<arr.length;right++)
    {
      sum+=arr[right];

      while(sum>goal)
      {
        sum-=arr[left];
        left++;
      }

      count+=right-left+1;
    }
    return count;
  }
    public static void main(String[] args) {
      int[] arr={1, 0, 1, 0, 1};
      int goal=2;
      System.out.println(binarySubarraySum(arr,goal));  
    }
}
