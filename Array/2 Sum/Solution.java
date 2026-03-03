import java.util.*;
import java.util.Arrays;

public class Solution {

    public static int[] twoSum(int arr[], int target)
    {
        // Map <Integer,Integer> element=new HashMap<>();
        List<Integer>element=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int number=arr[i];
            if(element.contains(target-number))
            {
                return new int[]{element.indexOf(target-number),i};
            }
            element.add(number);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        System.out.println("the indices are: "+(Arrays.toString(twoSum(arr, target))));
    }
}
