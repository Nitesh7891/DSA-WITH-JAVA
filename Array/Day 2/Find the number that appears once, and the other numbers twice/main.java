import java.util.Arrays;
public class main {
    public static int findSingleNumber(int[] arr, int n) {
        /*
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1; // If no single number is found
        */

        //optimal approach
        int result=0;
        for(int i=0;i<n;i++){
            result=result^arr[i];
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 3, 4, 4, 5 };
        int n = arr.length;
        System.out.println("Original array is: " + Arrays.toString(arr));
        System.out.println("The number that appears once is: " + findSingleNumber(arr, n));
    }
}
