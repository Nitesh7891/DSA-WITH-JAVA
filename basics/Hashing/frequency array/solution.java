import java.util.Arrays;

public class solution {
    public static int largestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = largest < arr[i] ? arr[i] : largest;
        }
        return largest;
    }

    public static int[] hashing(int[] freq, int[] arr) {
        for (int num : arr) {
            freq[num] = freq[num] + 1;
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 2, 5, 3, 6, 7, 6, 7, 2, 2, 1, 5, 9, 6, 7, 2 };
        int largest = largestElement(arr);
        int[] freq = new int[largest + 1];
        Arrays.fill(freq, 0);
        System.out.println(Arrays.toString(hashing(freq, arr)));
        System.out.println("occourence of 5 in array is " + freq[5]);

    }
}
