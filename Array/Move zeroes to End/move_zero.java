import java.util.Arrays;

public class move_zero {
    public static int[] moveZeroes(int[] nums){
       int i=0;
       for(int num:nums)
        if(num!=0)  nums[i++]=num;
       
       while(i<nums.length)
          nums[i++]=0;
        return nums;
    }
    public static void main(String[] args) {
        int[] arr={0,0,1,2,0,4,5,0};
        System.out.println("Array after moving zeroes to the end is "+ Arrays.toString(moveZeroes(arr)));
    }
}
