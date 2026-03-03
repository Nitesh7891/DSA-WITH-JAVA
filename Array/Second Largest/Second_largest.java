import java.util.Arrays;

public class Second_largest {
    public static int secondLargest(int[] arr) {
      //Brute force approach
    //   Arrays.sort(arr);
    //   int largest=arr[arr.length-1];
    //   int i=arr.length-2;
    //   while(i>=0 && arr[i]==largest){
    //      i--;
    //   }

    //   if(i<0) return -1;

    //   return arr[i];

      //optimal approach
       int largest=Integer.MIN_VALUE;
       int second_largest=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            second_largest=largest;
            largest=arr[i];
        }
        else if(arr[i]>second_largest && arr[i]!=largest){
            second_largest=arr[i];
        }
       }

       return second_largest;



    }
    public static void main(String[] args) {
        int[] arr={10,10,10,7,8,8,9};
        System.out.println("The second largest element in the array is "+secondLargest(arr));
    }
}
