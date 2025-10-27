public class solution {
    public static int solve(int[] arr,int target)
    {
        int res=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]<=target)
            {
                if(arr[mid]==target)
                res=mid;

                low=mid+1;
            }
            else high=mid-1;
        }
        return res;
    }
   public static void main(String args[]) {
    int target = 13;
    int[] arr = {3,4,13,13,13,20,40};

    // returning the last occurrence index if the element is present otherwise -1
    System.out.println(solve(arr,target ));
  }    
}
