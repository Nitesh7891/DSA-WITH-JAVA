import java.util.*;
public class solution {
    public static int majorityElement(int[] nums)
    {
        int n=nums.length;
    //   Map<Integer,Integer> map=new HashMap<>();
    //   for(int num:nums)
    //   {
    //     map.put(num,map.getOrDefault(num,0)+1);

    //     if(map.get(num)>n/2)
    //         return num;
    //   }

    //   return -1;

    //optimal approach
    int count=0,element=-1;
    for(int num:nums)
    {
        if(count==0)
        {
            element=num;
        }
        if(num==element)
            count++;
        else
            count--;
    }
    return element;

    }
    public static void main(String[] args) {
        int[] nums={7,7,5,5,5,7,7};
        System.out.println("The majority element is: " + majorityElement(nums));

    }
}
