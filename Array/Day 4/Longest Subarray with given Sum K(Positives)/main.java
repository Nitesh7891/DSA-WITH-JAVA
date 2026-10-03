

public class main {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5};
        int k=12;
        int left=0;
        int sum=0;
        int longest=0;
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
        System.out.println("Longest subarray with given sum "+k+" is of length "+longest);
    }
}
