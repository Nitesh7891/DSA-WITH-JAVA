import java.util.*;

public class solution {
    public static boolean linearSearch(int[] arr,int x)
    {
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==x)
            return true;
      }
      return false;
    }
    public static int longestConsecutive(int[] arr) {
      int max=Integer.MIN_VALUE;
        if(arr.length==0)
            return 0;

        Set<Integer> set=new HashSet<>();
        for(int num:arr) set.add(num);

        for(int num:arr)
        {
            int count=1;
            int current=num;
            if(!set.contains(num-1))
            {
               
                while(set.contains(current+1))
                {
                    count++;
                    current++;
                }
            }
            max=Math.max(max,count);
        }

    //Brute force approach
    //    for(int num:arr)
    //    {
    //       int count=1;
    //       int current=num;
    //     while(linearSearch(arr, current+1))
    //     {
    //         count+=1;
    //         current+=1;
    //        // System.out.println(count);
            
    //     }
    //     max=Math.max(max,count); 

       //}
       return max;

    }
    public static void main(String[] args) {
        int[] arr={100,4,200,1,3,2};
        System.out.println("Longest consecutive sequence length: "+longestConsecutive(arr));
    }
}
