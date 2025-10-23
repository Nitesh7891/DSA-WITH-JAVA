public class solution {

    static int consecutiveOnes(int[] arr,int k)
    {   
         //Brute force approach
        // int maxLength=0;
        
        // for(int i=0;i<arr.length;i++)
        // {
        //     int zeroes=0;
        //     for(int j=i;j<arr.length;j++)
        //     {
        //      if(arr[j]==0)
        //          zeroes++;
             
        //      if(zeroes<=k)
        //         maxLength=Math.max(maxLength,j-i+1);
             
        //      else 
        //         break;

        //     }
        // }
        // return maxLength;

        //optimal approach
        int left=0,right=0,maxLen=Integer.MIN_VALUE,zeroes=0;
        while(right<arr.length)
        {
            if(arr[right]==0)  zeroes++;

            if(zeroes>k)
            {
                if(arr[left]==0) zeroes--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int [] arr={1,1,1,1,0,0,1,1,0,0,1,1};
        int k=2;
        System.out.println(consecutiveOnes(arr, k));

    }
}
