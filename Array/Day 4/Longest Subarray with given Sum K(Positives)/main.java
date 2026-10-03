

public class main {
    public static int longestSubarray(int[] arr,int k){
        //Brute force approach
        int sum=0;
        int longest=0;
        /* Brute force approach 
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    longest=Math.max(longest,j-i+1);
                    break;
                }
            }
        }
        */

        //optimal approach using sliding window technique
        int left=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                longest=Math.max(longest,right-left+1);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5};
        int k=12;
        System.out.println("Longest subarray with given sum "+k+" is of length "+longestSubarray(arr,k));
    }
}
