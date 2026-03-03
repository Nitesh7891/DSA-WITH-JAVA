import java.util.*;

public class remove {
    public static int[] removeDuplicates(int[] arr) {
      //Brute force using set data structure
      // Set<Integer> set=new HashSet<>();
      // int index=0;
      // for(int num:arr){
      //  if(set.add(num)){
      //   arr[index++]=num;
      //  }
      // }

      // while(index<arr.length){
      //   arr[index]=0;
      //   index++;
      // }

      // return arr;

    //Two pointer approach
    int i=0,j=1;
    while(j<arr.length){
      if(arr[i]!=arr[j]){
          arr[++i]=arr[j];
      }
     j++;
    }
      
    while(i<arr.length-1){
      arr[i+1]=0;
      i++;
    }

    return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,4,4,5,7,9};
         System.out.println("The array before removing duplicates are"+Arrays.toString(arr));
        System.out.println("The array after removing duplicates are"+Arrays.toString(removeDuplicates(arr)));
    }
}
