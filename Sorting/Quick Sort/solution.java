public class solution{
    public static int partitionIndex(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high && arr[i]<=pivot) i++;
            while(j>=low && arr[j]>pivot) j--;

            if(i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;

        return j;
    }
    public void QuickSort(int[] arr,int low,int high){
        if(low<high){
          int partitionIndex=partitionIndex(arr,low,high);
          QuickSort(arr,low,partitionIndex-1);
          QuickSort(arr,partitionIndex+1,high);
        }
    }
    public static void main(String[] args) {
          int[] arr = {5, 2, 8, 4, 1};
        solution sol = new solution();
        sol.QuickSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
    
}