import java.util.*;

public class main {
    public int[] removeDuplicates(int[] arr) {
        /* 
        Brute force approach 
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            } else
                continue;
        }
        int i = 0;
        for (int num : set) {
            arr[i++] = num;
        }
        while (i < arr.length) {
            arr[i++] = 0;
        }
        */

        //optimal approach
        int j=0;
        for(int i=0;i<arr.length;i++){
            for(int k=i+1;k<arr.length;k++){
                if(arr[i]>arr[k]){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
         if(arr[j]!=arr[i]){
            arr[++j] = arr[i];
         }
        }
        while(j<arr.length-1){
            arr[++j] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
       int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5 };
        System.out.println("Original array " + Arrays.toString(arr));
        main obj1 = new main();
        System.out.println("Array withour duplicate elements:" + Arrays.toString(obj1.removeDuplicates(arr)));

    }
}