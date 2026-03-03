import java.util.Arrays;

public class solution {
    public static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex]) minIndex=j;
            }
            if(minIndex!=i)
            {
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
   public static void main(String[] args) {
    int[] arr = {64, 25, 12, 22, 11};
    System.out.println("Before Using Selection Sort:" + Arrays.toString(arr));
    System.out.println("After Using Selection Sort:" + Arrays.toString(selectionSort(arr)));

   } 
}
