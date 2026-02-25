class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //Brute force approach
        // int minLength = Integer.MAX_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         sum += nums[j];
        //         if (sum >= target) {
        //             minLength = Math.min(minLength, j - i + 1);
        //             break;
        //         }
        //     }
        // }

        // return minLength == Integer.MAX_VALUE ? 0 : minLength;

        //optimal approach
        int left=0, sum=0;
        int minLength=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
          sum+=nums[right];
          while(sum>=target){
            minLength=Math.min(minLength,right-left+1);
            sum-=nums[left++];
          }
        }
       return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args) {
        int target=7;
        int[] nums={2,3,1,2,4,3};
        Solution solution=new Solution();
        System.out.println(solution.minSubArrayLen(target,nums));
    }
}