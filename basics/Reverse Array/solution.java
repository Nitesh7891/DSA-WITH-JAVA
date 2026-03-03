import java.util.Arrays;

public class solution {
    public static void reverse(int[] arr,int i,int j){
        if(i>=j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        reverse(arr,++i,--j);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int i=0,j=n-1;
        reverse(arr,i,j);
        System.out.println(Arrays.toString(arr));
    }
}
