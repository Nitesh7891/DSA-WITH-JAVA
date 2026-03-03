import java.util.Arrays;
import java.util.List;
import java.util.*;


public class Solution {
    public static int[][] merge(int[][] intervals){
       if(intervals.length<=1) return intervals;
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

    //Brute force approach
    //    List<int[]>  merged=new ArrayList<>();
    //    int i=0;
    //    while(i<intervals.length){
    //     int j=i+1;
    //     int start=intervals[i][0];
    //     int end=intervals[i][1];
    //     while(j<intervals.length && intervals[j][0]<=end){
    //         end=Math.max(end,intervals[j][1]);
    //      j++;
    //     }
    //     merged.add(new int[]{start,end});
    //     i=j;
    //    }

    //    return merged.toArray(new int[(merged.size())][]);
       


    //optimal approach
    List<int[]> result=new ArrayList<>();
    for(int i=0;i<intervals.length;i++){
     if(result.isEmpty() || result.get(result.size()-1)[1]<intervals[i][0]){
        result.add(intervals[i]);
     }
     else{
        result.get(result.size()-1)[1]=Math.max(result.get(result.size()-1)[1],intervals[i][1]);
     }
     }
     return result.toArray(new int[result.size()][]);
    }
    
  public static void main(String[] args) {
    int arr[][]={{1,6},{1,3},{2,6},{5,9},{6,10},{3,10},{1,5}};
    System.out.println(Arrays.deepToString(merge(arr)));
  }
}
