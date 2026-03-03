import java.util.*;

public class solution {
    public static void merge(int[] arr,int low,int mid,int high){
       List<Integer> temp=new ArrayList<>();
       int left=low,right=mid+1;

       while(left<=mid && right<=high){
        if (arr[left]<=arr[right]) {
            temp.add(arr[left++]);
        } else {
            temp.add(arr[right++]);
        }
       }

       while(left<=mid){
        temp.add(arr[left++]);
       }

       while(right<=high){
        temp.add(arr[right++]);
       }


       for(int i=low;i<=high;i++){
        arr[i]=temp.get(i-low);
       }
    }
    public void mergeSort(int[] arr,int left,int right){
        if(left>=right) return;

        int mid=(left+right)/2;

        mergeSort(arr, left, mid);

        mergeSort(arr,mid+1,right);
        merge(arr, left, mid, right);


    }
    public static void main(String[] args) {
         int[] arr = {5, 2, 8, 4, 1};
        solution sol = new solution();
        sol.mergeSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
