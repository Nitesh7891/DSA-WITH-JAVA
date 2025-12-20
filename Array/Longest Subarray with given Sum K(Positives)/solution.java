public class solution {
    public static int longestSubarrayWithSumK(int[] arr, int k) {
        int left=0,right=0, sum=0,maxlength=0;
        while(right<arr.length)
        {
            sum+=arr[right];
            while(left<=right && sum>k)
            {
                sum=sum-arr[left];
                left++;
            }
            if(sum==k) maxlength=Math.max(maxlength,right-left+1);

            right++;
        }
        return maxlength;
    }
   public static void main(String[] args) {
    int[] nums ={10, 5, 2, 7, 1, 9};
    int k=15;
    System.out.println(longestSubarrayWithSumK(nums, k));
   } 
}
