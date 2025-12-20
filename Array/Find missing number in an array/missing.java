
public class missing {
    public static int missing_number(int arr[])
    {
        int n=arr.length;
        int actualSum=0;
        int expectedSum=n*(n+1)/2;
        for(int num:arr)
        actualSum+=num;
       return expectedSum-actualSum;
    }
    public static void main(String[] args) {
        int [] arr={0,2,3};
        System.out.println("The missing number is"+missing_number(arr));
    }
}
