import java.util.*;

public class sum {
    public static int[] twoSum(int[] nums,int target){
        //brute force approach
        /* 
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};                }
            }
        }
        */

        //optimal approach
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment = target- nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.putIfAbsent(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {1, 2,4, 3, 4, 5};
        int target = 9;
        System.out.println("Find indices of two numbers in an array  " + Arrays.toString(arr) + " that sum to target: " + target);
        System.out.println("Indices: " + Arrays.toString(twoSum(arr, target)));
    }
}
