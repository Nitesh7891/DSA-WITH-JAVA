import java.util.*;

public class remove {
    public static int[] removeDuplicates(int[] arr) {
        int j=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
             }
           
                arr[i]=0;
            
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
         System.out.println("The array before removing duplicates are"+Arrays.toString(arr));
        System.out.println("The array after removing duplicates are"+Arrays.toString(removeDuplicates(arr)));
    }
}
