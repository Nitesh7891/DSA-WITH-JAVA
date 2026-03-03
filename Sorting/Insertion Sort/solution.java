import java.util.Arrays;

public class solution {
    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11,12};
        System.out.println("Before Using Insertion Sort:" + Arrays.toString(arr));
        System.out.println("After Using Insertion Sort:" + Arrays.toString(insertionSort(arr)));
    }
}
