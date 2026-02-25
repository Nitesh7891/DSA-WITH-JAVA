class Solution {
    public static double findMaxAverage(int[] nums, int k) {
    //Brute force approach
    //    double average=0,maxAverage=Double.NEGATIVE_INFINITY;
    //     for(int i=0;i<=nums.length-k;i++){
    //         double sum=0;
    //         for(int j=i;j<i+k;j++){
    //             sum+=nums[j];
    //         }
    //                 average=sum/k;
    //         maxAverage=Math.max(average,maxAverage);
    //     }
    //     return maxAverage;


    //optimal approach
    double average=0,maxAverage=Double.NEGATIVE_INFINITY;
    double sum=0;
    if(nums.length==k){
     for(int num:nums){
       sum+=num;
      
     }
     return sum/k;
    }

    int left=0;
    for(int right=0;right<nums.length;right++)
    {
       sum+=nums[right];

       if(right-left+1==k){
        average=sum/k;
        maxAverage=Math.max(average,maxAverage);
        sum-=nums[left++];
       }
    }
    return maxAverage;
    }
    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
}