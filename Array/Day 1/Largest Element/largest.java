import java.util.*;

public class largest {
    public static int largestElement(int[] arr, int n) {
        /*Brute force approach
        first sort the array in descending order and return the first element of the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[0];
        */

        //optimal approach
        int max=arr[0];
        for(int i=0;i<n;i++){
            max=max<arr[i]?arr[i]:max;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 4, 7, 2, 6, 8, 9, 0, 1,10,1,5,10,11, 3, 4, 5 };
        int n = arr.length;
        System.out.println("Original Array: " + Arrays.toString(arr));
        int largest = largestElement(arr, n);
        System.out.print("Largest Element: " + largest);
    }
}
