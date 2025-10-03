import java.util.*;
import java.util.Map;
import java.util.Arrays;

public class Solution {

    public static int[] twoSum(int arr[], int target)
    {
        Map <Integer,Integer> element=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int number=arr[i];
            if(element.containsKey(target-number))
            {
                return new int[]{element.get(target-number),i};
            }
            element.put(number,i);
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=0;
        System.out.println("the indices are: "+(Arrays.toString(twoSum(arr, target))));
    }
}
