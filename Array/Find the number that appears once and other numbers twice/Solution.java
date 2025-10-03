

public class Solution {

    public static int SingleNumber(int[] nums)
    {
        int ans=0;
        for(int num:nums)
        {
            ans=num^ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={4,1,2,1,2};
        System.out.println("The single number is: " + SingleNumber(arr));
    }
}
