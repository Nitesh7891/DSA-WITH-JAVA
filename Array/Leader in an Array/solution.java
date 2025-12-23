import java.util.*;
public class solution{
    public static int[] printLeaders(int[] arr) {
        List<Integer> leaders=new ArrayList<>();


    // Brute force approach
    //    for(int i=0;i<arr.length;i++)
    //    {
    //     boolean leader=true;
    //     for(int j=i;j<arr.length;j++)
    //     {
    //       if(arr[j]>arr[i])
    //         {
    //             leader=false;
    //             break;
    //         }
          
    //     }
    //     if(leader) leaders.add(arr[i]);  
    //    }
    //    return leaders.stream().mapToInt(i->i).toArray();

    //optimal approach
    int max=arr[arr.length-1];
    leaders.add(max);
    for(int i=arr.length-2;i>=0;i--)
    {
        if(arr[i]>max)
        {
            leaders.add(arr[i]);
            max=arr[i];
        }
    }
    return leaders.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
       System.out.println(Arrays.toString(printLeaders(arr)));
    }
}