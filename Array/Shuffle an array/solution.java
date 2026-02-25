import java.util.Arrays;

public class solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int j=n;
        for(int i=0;i<n;i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[j++];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
       System.out.println("Shuffled array is "+ Arrays.toString(shuffle(arr,3)));
        
    }
}
