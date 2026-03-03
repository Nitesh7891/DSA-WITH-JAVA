import java.util.Arrays;

public class solution{
    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++)
        {
            boolean swapped=false;
           for(int j=0;j<arr.length-i-1;j++)
           {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
           }

           if(swapped==false) break;
        }
        return arr;
    }
    public static void main(String[] args) {
           int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.println("Before Using Bubble Sort:"+Arrays.toString(arr));
        System.out.println("After Using Bubble Sort:"+Arrays.toString(bubbleSort(arr)));
       

        
    }
}