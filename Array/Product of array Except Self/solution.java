import java.util.Arrays;

public class solution {
    public int[] productExceptSelf(int[] arr,int n){
      int[] result=new int[n];
      int prefix=1;
      for(int i=0;i<n;i++){
        result[i]=prefix;
        prefix=prefix*arr[i];
      }

      int suffix=1;
      for(int i=n-1;i>=0;i--){
        result[i]*=suffix;
        suffix=suffix*arr[i];
      }

      return result;
    }
   public static void main(String[] args) {
    int[] arr={5,2,1,4,3};
    int n=arr.length;
    solution obj=new solution();
    System.out.println(Arrays.toString(obj.productExceptSelf(arr,n)));
   } 
}
