import java.util.*;

public class solution {
    public static boolean firstSubsequence(int[] arr,int k,int sum,int index,List<Integer> current,List<List<Integer>>result)
    {
        if(index>=arr.length)
        {
            if(sum==k)
            {
            result.add(new ArrayList<>(current));
            System.out.println(result);
            return true;
            }
            return false;
        }

        current.add(arr[index]);
        sum=sum+arr[index];
        if(firstSubsequence(arr, k, sum, index+1, current, result)==true)
        {
            return true;
        }
        current.remove(current.size()-1);
        sum=sum-arr[index];
        if(firstSubsequence(arr, k, sum, index+1, current, result)==true)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        List<List<Integer>>result=new ArrayList<>();
        firstSubsequence(arr,3,0,0, new ArrayList<>(), result);
    }
}
