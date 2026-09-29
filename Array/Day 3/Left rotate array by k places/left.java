import java.util.Arrays;

public class left {
    public static int[] left_rotate(int[] arr, int n, int k) {
        int[] result = new int[n];
        k=k%n;
        for (int i = 0; i < n; i++) {
            if(i<k){
                result[n+(i-k)]=arr[i];
            }else{
                result[i-k]=arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int k = 8;
        System.out.println("Original Array:" + Arrays.toString(arr));
        System.out.println("Left rotated array by " + k + " places: " + Arrays.toString(left_rotate(arr, n, k)));

    }
}
