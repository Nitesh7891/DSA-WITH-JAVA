public class solution {

    public static int search(int[] arr,int target)
    {
        //recursive implementation
        return binarySearch(arr, target, 0, arr.length-1);
    }
    public static int binarySearch(int[] arr,int target,int low,int high)
    {
        //recursive implementation
        if(low>high)  return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]<target) return binarySearch(arr, target, mid+1, high);
        return binarySearch(arr, target, low, mid-1);


        //Iterative implementation:
        // int left=0,right=arr.length-1;
        // while(left<=right)
        // {
        //     int mid=(right+left)/2;

        //     if(arr[mid]==x)  return mid;
        //     else if(x>arr[mid]) left=mid+1;
        //     else
        //     right=mid-1;
        // }
        // return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int x=7;

        //Iterative implementation:
        // System.out.println(binarySearch(arr,x));


        //recursive implementation
         System.out.println(search(arr,x));
   
    }
}
