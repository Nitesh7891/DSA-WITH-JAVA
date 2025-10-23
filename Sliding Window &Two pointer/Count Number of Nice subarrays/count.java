

public class count {
    public static int countNiceSubarrays(int[] arr,int k)
    {
        //Brute force approach
        // int count=0;
        
        // for(int i=0;i<arr.length;i++)
        // {
        //     int oddCount=0;
        //     for(int j=i;j<arr.length;j++)
        //     {
        //         if(arr[j]%2!=0)
        //         oddCount++;

        //         if(oddCount==k)
        //         {
        //             count++;
        //         }
        //         else if(oddCount>k)
        //         {
        //             break;
        //         }
        //     }
        // }
        // return count;


        //optimal solution
        int left=0;
        int res=0;
        for(int right=0;right<arr.length;right++)
        {
            if(arr[right]%2!=0)
            k--;

            while(k<0)
            {
                if(arr[left]%2!=0) k++;
                left++;
            }

            res+=right-left+1;
            System.out.println(res);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 1, 1};
        int k=3;
        System.out.println(countNiceSubarrays(arr, 3));
        
    }
}
