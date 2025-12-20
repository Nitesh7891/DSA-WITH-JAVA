
public class solution {
    public static int maximumConsecutiveOnes(int[] nums)
    {
        int count=0,maxFreq=0;
        for(int num:nums)
        {
          if(num==1)
          {
            count++;
          }
          else
          {
            count=0;
          }
          maxFreq=Math.max(maxFreq,count);
        }
        return maxFreq;
    }
    public static void main(String[] args) {
         int[] nums = {1, 1, 0, 1, 1, 1};
         int ans=maximumConsecutiveOnes(nums);
        System.out.println("The maximum consecutive 1's are " + ans);
    }
}
