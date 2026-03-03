import java.util.*;
public class solution {
    public static void generateSubsequences(int k,int sum,int[] arr,int index,List<Integer> current,List<List<Integer>>result)
    {
     if(index>=arr.length)
     {
        if(sum==k)
        {
        result.add(new ArrayList<>(current));

        }
        return ;
     }

       current.add(arr[index]);
       sum=sum+arr[index];
       generateSubsequences(k, sum, arr, index+1, current, result);

     current.remove(current.size()-1);
     sum=sum-arr[index];
     generateSubsequences(k, sum, arr, index+1, current, result);
    }

   public static void main(String[] args) {
     int[] arr={1,2,3,1,4};
    int k=3;
    List<List<Integer>>result=new ArrayList<>();
    generateSubsequences(k,0,arr,0,new ArrayList<>(),result);

    System.out.println(result);

   }
}
