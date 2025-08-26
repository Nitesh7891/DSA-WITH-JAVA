public class check_sorted_rotated{

    public static boolean check(int[]arr){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[(i+1)%arr.length])
            count++;

            if(count>1)
            return false;
        }

return true;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        if(check(nums))
        {
            System.out.println("the array is sorted and rotated");
        }
        else{
            System.out.println("the array is not sorted and rotated");
        }
    }
}