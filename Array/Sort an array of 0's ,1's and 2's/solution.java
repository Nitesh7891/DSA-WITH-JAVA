//import java.sql.Array;
import java.util.Arrays;

public class solution {
    public static int[] sortArray(int[] arr)
    {
       int low=0,mid=0,high=arr.length-1;
       while(mid<=high)
       {
        if(arr[mid]==0)
        {
            int temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;
            low++;
            mid++;
        }
        else if(arr[mid]==1)
        {
          mid++;
        }
        else{
            int temp=arr[mid];
            arr[mid]=arr[high];
            arr[high]=temp;
            high--;
        }
       }
        
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0,1,1,1,1,0,2,0,1};
        System.out.println("array:"+Arrays.toString(arr));
        System.out.println("Array after sorting "+Arrays.toString(sortArray(arr)));
    }
}
