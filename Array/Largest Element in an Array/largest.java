public class largest{
    public static int largest_element(int []arr)
    {
        //if the array is empty then
        if(arr.length==0)
        {
            return -1;
        }
        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int nums[]={10,5,1,9,10};
        System.out.print("The largest element in array is "+ largest_element(nums));
    }
}