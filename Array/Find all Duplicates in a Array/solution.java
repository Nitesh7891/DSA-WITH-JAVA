import java.util.*;

public class solution {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        //Brute force approach
        //valid fro all values but O(n) space complexity
        // Set<Integer> seen = new HashSet<>();
        // for (int num : nums) {
        //     if (seen.contains(num)) {
        //         duplicates.add(num);
        //     } else {
        //         seen.add(num);
        //     }
        // }

        //Optimal approach
        //index marking approach only valid for 1 to n range values
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                duplicates.add(Math.abs(nums[i]));
            }
            else{
                nums[index]=-nums[index];
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(arr));
    }
}
