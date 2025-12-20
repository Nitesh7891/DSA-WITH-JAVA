import java.util.*;

public class solution {
    public static int[] rearrangeArrayBySign(int[] nums)
    {
        // Brute Force approach
        // int[] positive=new int[nums.length/2];
        // int[] negative=new int[nums.length/2];
        // int i=0,j=0,k=0;
        // while(i<nums.length )
        // {
        //     if(nums[i]>0)
        //     {
        //         positive[j]=nums[i];
        //         j++;
        //     }
        //     else
        //     {
        //         negative[k]=nums[i];
        //         k++;
        //     }
        //     i++;
        // }
        // for(int a=0;a<nums.length/2;a++)
        // {
        //     nums[2*a]=positive[a];
        //     nums[2*a+1]=negative[a];
        // }
        // return nums;

        //optimal approach
        int[] result=new int[nums.length];
        int posIndex=0,negIndex=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                result[posIndex]=nums[i];
                posIndex+=2;
            }
            else{
                result[negIndex]=nums[i];
                negIndex+=2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -1, -2,-4,2, -3, 4, 5, 6 };

        System.out.println(Arrays.toString(rearrangeArrayBySign(nums)));
    }
}
