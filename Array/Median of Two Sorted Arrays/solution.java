

public class solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2,4};
        double median = findMedian(nums1, nums2);
        System.out.println("Median is: " + median);
    }

    public static double findMedian(int[] nums1, int[] nums2) {
    //Brute force approach
       int n=nums1.length,m=nums2.length;
       int [] arr=new int[n+m];
       int i=0,j=0,k=0;

       while(i<n && j<m)
       {
        if(nums1[i]<nums2[j])
        {
            arr[k++]=nums1[i++];
        }
        else
        arr[k++]=nums2[j++];
       }

       while(i<n) arr[k++]=nums1[i++];
       while(j<m) arr[k++]=nums2[j++];

       if(arr.length%2==1)
       {
        return arr[arr.length/2];
       }

        return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
    }

    
}
