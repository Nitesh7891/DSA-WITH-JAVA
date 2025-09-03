

public class Second_largest {
    public static int secondLargest(int[] arr) {
       int largest=Integer.MIN_VALUE;
       int second_largest=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]>largest)
        {
            second_largest=largest;
            largest=arr[i];
        }
        else if(arr[i]>second_largest && arr[i]!=largest)
        second_largest=arr[i];
       }

       return second_largest;
       
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,4,5,5};
        System.out.println("The second largest element in the array is "+secondLargest(arr));
    }
}
