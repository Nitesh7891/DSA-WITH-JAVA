public class solution {
    public static boolean searchInARotatedSortedArrayII(int[]arr, int k)
    {
      int low=0,high=arr.length-1;
      while(low<=high)
      {
        int mid=low+(high-low)/2;

        if(arr[mid]==k) return true;

        //edge case
        if(arr[low]==arr[mid] && arr[high]==arr[mid])
        {
            low=low+1;
            high=high-1;
            continue;
        }
         
        //if left part is sorted then
        if(arr[low]<=arr[mid])
        {
         if(arr[low]<=k && arr[mid]>k)
         {
            high=mid-1;
         }
         else
         low=mid+1;
        }

        //if right part is sorted then
        else{
            if(arr[low]>=arr[mid])
            {
                if(arr[high]>=k && arr[mid]<k)
         {
            low=mid+1;
         }
         else
         high=mid-1;
            }

        }
      }
      return false;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2,  3,  4, 5, 6};
        int k = 3;
        boolean ans = searchInARotatedSortedArrayII(arr, k);
        if (ans == false)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the array.");
    }
}
