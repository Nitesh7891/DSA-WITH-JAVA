import java.util.Arrays;


public class singleNumber {
    public static int single(int[] arr)
    { 
        int ans=0;
        for(int i=0;i<32;i++)
        {
            int count=0;
            for(int num:arr)
            {
                if(((num>>i)&1)==1) count++;
            }
            if(count%3==1)  ans=ans|(1<<i);
        }
        return ans;
    }

    public static int single_second_approach(int[] arr)
    { 
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i=i+3)
        {
            if(arr[i]!=arr[i-1]) 
            {
                return arr[i-1];
            }
        }
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int [] arr={2,2,3,4,2,4,4,5,5,5,6,3,3};
        System.out.println("The Numbers are "+Arrays.toString(arr));
        System.out.println("The Number that appears once in an array is "+single(arr));
         System.out.println("The Number that appears once in an array is "+single_second_approach(arr));
        
    }
}
