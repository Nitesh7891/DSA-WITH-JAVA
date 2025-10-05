import java.util.*;
public class Solution{
    public static void powerSet(int[] arr,int index,List<Integer> current,List<List<Integer>> result)
    {
      if(index>=arr.length)  
     { 
      result.add(new ArrayList<>(current));
      System.out.println(current);
      return;
     }
      current.add(arr[index]);
      powerSet(arr,index+1,current,result);

      current.remove(current.size()-1); 
      powerSet(arr, index+1, current, result);
      
    }
    public static void main(String[] args) {
        int arr[]={3,2,1};
        List<List<Integer>>result=new ArrayList<>();
        powerSet(arr,0,new ArrayList<>(),result);
    }
}