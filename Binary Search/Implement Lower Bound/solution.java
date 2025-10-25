//The lower bound is the smallest index, ind, where arr[ind] >= x. But if any such index is not found, 
//the lower bound algorithm returns n i.e. size of the given array.

public class solution {
    public static int binarySearch(int[] arr,int target) {
        int ans=arr.length;
        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=target)
           {
            ans=mid;
            high=mid-1;

           }
           else low=mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8,9};
        int target=6;
        System.out.println(binarySearch(arr, target));
    }
}
