import java.util.*;

public class solution {
    public int maxLen(int[] arr,int n){
        //Brute force approach
        // int maxLength=Integer.MIN_VALUE;
        // for(int i=0;i<n-1;i++){
        //     int sum=arr[i];
        //   for(int j=i+1;j<n;j++){
        //     sum+=arr[j];
        //     if(sum==0){
        //         maxLength=maxLength>(j-i+1)?maxLength:(j-i+1);
        //     }
        //   }
        // }
        // return maxLength;

        //optimal approach
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0,maxi=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
             maxi=i+1;
            }
            else{
                if (map.containsKey(sum)) {
                    maxi=Math.max(maxi,i-map.get(sum));
                } else {
                    map.put(sum,i);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
           int[] A = {9, -3, 3, -1, 6, -5};
        // compute size
        int n = A.length;
        // compute result
        int ans = new solution().maxLen(A, n);
        // print result
        System.out.println(ans);
    }
}
