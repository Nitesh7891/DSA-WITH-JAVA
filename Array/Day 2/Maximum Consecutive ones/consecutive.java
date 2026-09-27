import java.util.Arrays;

public class consecutive {
    public static int findMaxConsecutiveOnes(int[] arr, int n) {
        int maxCount=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                maxCount=Math.max(maxCount,count);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
    int[] arr={1, 1, 0, 1, 1, 1, 0, 1};
    int n=arr.length;
    System.out.println("The original array is: " + Arrays.toString(arr));
    System.out.println("The maximum consecutive ones is: " + findMaxConsecutiveOnes(arr, n));
    }
}
