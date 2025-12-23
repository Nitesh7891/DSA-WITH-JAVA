public class solution {
    public int subarraySum(int[] nums,int k)
    {
      int count=0;

    //Brute force approach
    //   for(int i=0;i<nums.length-1;i++)
    //   {
    //     int sum=nums[i];
    //     for(int j=i+1;j<nums.length;j++)
    //     {
    //         sum+=nums[j];   
    //         if(sum==k) count++;    
    //      }
    //   }

    //optimal approach
    int left=0,sum=0;
    for(int right=0;right<nums.length;right++)
    {
        sum+=nums[right];

        while(sum>k && left<=right)
        {
            sum-=nums[left];
            left++;
        }

        if(sum==k) count++;

    }
      return count;
    }
    public static void main(String[] args) {
         int[] arr = {3, 1, 2, 4,2,4,1,3};

        // Target sum
        int k = 6;

        // Create Solution object
        solution sol = new solution();

        // Call function and store result
        int result = sol.subarraySum(arr, k);

        // Print the count of subarrays
        System.out.println("The number of subarrays is: " + result);
    }
}
