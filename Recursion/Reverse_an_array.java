
import java.util.Arrays;

public class Reverse_an_array{
    public static int[] reverse(int arr[],int i,int j) {
        if(i>=j) return arr;
       else
       {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
       }

       return reverse(arr,i+1,j-1);

        
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        System.out.println(Arrays.toString(reverse(arr, 0, arr.length-1)));
    }
}