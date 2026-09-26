import java.util.*;

public class second_largest {

    public static int secondLargestElement(int[] arr, int n) {
        // brute force approach if array contains duplicate elements too
        // sort the array
        /*
         * int secondLargest= Integer.MIN_VALUE;
         * for(int i=0;i<n-1;i++){
         * for(int j=i+1;j<n;j++){
         * if(arr[i]<arr[j]){
         * int temp=arr[i];
         * arr[i]=arr[j];
         * arr[j]=temp;
         * }
         * }
         * }
         * //check if the largest element is present more than once in the array
         * int i=1;
         * while(n>1 && arr[0]==arr[i]){
         * i++;
         * }
         * secondLargest=arr[i];
         * return secondLargest;
         */

        // optimal approach
        int second_largest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
        return second_largest;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 4, 7, 2, 6, 8, 9, 0, 1, 11, 1, 5, 10, 11, 3, 4, 5 };
        int n = arr.length;
        System.out.println("Original Array: " + Arrays.toString(arr));
        int secondLargest = secondLargestElement(arr, n);
        System.out.print("Second Largest Element: " + secondLargest);
    }
}
