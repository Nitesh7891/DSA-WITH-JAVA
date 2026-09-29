import java.util.Arrays;
import java.util.HashMap;

public class majority {
    public static int majorityElement(int[] arr) {
       //Brute force approach
    //    int count=0;
    //    int max_count=0;
    //    int majority_element=0;
    //    for(int i=0;i<arr.length;i++){
    //      for(int j=0;j<arr.length;j++){
    //         if(arr[i]==arr[j]){
    //             count++;
    //         }

    //         if(count>max_count){
    //             max_count=count;
    //             majority_element=arr[i];
    //         }
    //      }
    //    }
    //    if(max_count>arr.length/2) return majority_element;

    //    return -1;

        //BETTER APPROACH
        //HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num:arr){
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // for(int num:arr){
        //     if(map.get(num) > arr.length / 2){
        //         return num;
        //     }
        // }

        //optimal approach using kadane's voting algorithm
        int count=0;
        int majority_element=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                majority_element=arr[i];
            }
            if(arr[i]==majority_element){
                count++;
            }else{
                count--;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 5, 1, 7, 1, 1, 1, 1, 2, 3, 4, 10 };
        System.out.println("Original Array:" + Arrays.toString(arr));
        System.out.println("Majority element in the array is: " + majorityElement(arr));
    }
}
