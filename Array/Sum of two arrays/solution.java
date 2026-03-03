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
    public static void addOne(int[] arr){
      int carry=0;
       for(int i=arr.length-1;i>=0;i--){
       if(arr[i]<9){
        carry=0;
        arr[i]+=1;
        break;
       }
       else{
        int sum=arr[i]+1;
        arr[i]=sum%10;
        carry=sum/10;
        System.out.println(carry);
       }
      }
      if(carry==1){
        System.out.print(1);
      }
      for(int num:arr) System.out.print(num);
    }
    public static void main(String[] args) {
       int[] arr1={9,1,2,3,4,5};
       int[] arr2={1,6,7,8,9,7};
       int[] arr3={1,9,9};

       System.out.println(Arrays.toString(addTwoArrays(arr1,arr2)));
       addOne(arr3);
    }
}
