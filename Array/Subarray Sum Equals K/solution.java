import java.util.*;

public class solution {
    public static int subarraySumEqualsK(int[] nums, int k) {
        //Brute Force approach
        // int count=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         sum+=nums[j];
        //         if(sum==k)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;

        //optimal approach
        int count=0,prefixSum=0;
        Map<Integer,Integer>map =new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
          prefixSum+=nums[i];
          
          int remove=prefixSum-k;

          if(map.containsKey(remove))
          {
              count+=map.get(remove);
          }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        System.out.println(subarraySumEqualsK(arr, k));
    }
}
