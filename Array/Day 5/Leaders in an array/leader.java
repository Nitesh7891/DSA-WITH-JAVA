import java.util.*;

public class leader {
    public static int[] leaders(int[] arr,int n){
        List<Integer> list=new ArrayList<>();
        /* 
        Brute force approach
        for(int i=0;i<n;i++){
            boolean leader=true;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader){
                list.add(arr[i]);
            }
        }
        */

        //optimal approach
        int max=arr[n-1];
        list.add(max);
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }
            
        }
        Collections.reverse(list);
        return list.stream().mapToInt(i->i).toArray();
    }
   public static void main(String[] args){
     int[] arr={16,17,4,3,5,2};
     int n=arr.length;
     System.out.println("Given array: "+Arrays.toString(arr));
     System.out.println("Leaders in the array: "+Arrays.toString(leaders(arr,n)));
   } 
}
