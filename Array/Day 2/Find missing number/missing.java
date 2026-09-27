import java.util.Arrays;

public class missing {
    public static int findMissingNumber(int[] arr, int n) {
        // Brute force approach
        /*
         * for(int i=1;i<=n;i++){
         * boolean found = false;
         * for(int j=0;j<n;j++){
         * if(arr[j]==i){
         * found = true;
         * break;
         * }
         * }
         * if(!found) return i;
         * }
         * return -1; // If no missing number is found
         */

        // optimal approach
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        int n = arr.length+1;
        System.out.println("The original array is: " + Arrays.toString(arr));
        System.out.println("The missing number is: " + findMissingNumber(arr, n));
    }
}