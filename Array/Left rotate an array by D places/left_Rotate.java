import java.util.Arrays;

public class left_Rotate {
    public static int [] left_rotation(int[] nums,int k)
    {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        

      return nums;
    }

    public static int[]reverse(int[] arr,int start,int end)
    {
      while(start<end)
      {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        start++;
        end--;
      }
      return arr;
    } 
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        System.out.println("Array before rotation"+Arrays.toString(arr));
        System.out.println("Array after rotation"+Arrays.toString(left_rotation(arr,k)));
    }

}
