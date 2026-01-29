import java.util.Arrays;

public class solution {
    public static int[] addTwoArrays(int[] arr1,int[] arr2){
        int max=Math.max(arr1.length,arr2.length);
       
       int [] arr3=new int[max+1];
      int i=arr1.length-1,j=arr2.length-1,k=arr3.length-1;
      int carry=0;
      
      while(k>=1){
        int sum=carry;
       if(i>=0){
        sum+=arr1[i];
       }
       if(j>=0){
        sum+=arr2[j];
       }

       carry=sum/10;
         arr3[k]=sum%10;
        i--;
        j--;
        k--;
      }
      if(carry==1){
        arr3[0]=1;
      }
    

       return arr3;
    }
    public static void main(String[] args) {
       int[] arr1={9,1,2,3,4,5};
       int[] arr2={1,6,7,8,9,7};

       System.out.println(Arrays.toString(addTwoArrays(arr1,arr2)));
    }
}
