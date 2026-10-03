import java.util.*;

public class main {
    public static int[] union(int[] arr1,int[] arr2){
        Set<Integer> set=new LinkedHashSet<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                set.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                set.add(arr2[j]);
                j++;
            }
            else{
                set.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            set.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            set.add(arr2[j]);
            j++;
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,5,6};
        int[] arr2={3,4,5,6,7,8};
        System.out.println("Given array 1: "+Arrays.toString(arr1));
        System.out.println("Given array 2: "+Arrays.toString(arr2));
        System.out.println("Union of two sorted arrays: "+Arrays.toString(union(arr1,arr2)));
    }
}
