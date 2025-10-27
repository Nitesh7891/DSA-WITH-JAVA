public class solution {
    public static int firstOccurrence(int[] arr, int x) {
        int res = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                if (arr[mid] == x)
                    res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public static int lastOccurrence(int[] arr, int x) {
        int res = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x) {
                if (arr[mid] == x)
                    res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
    public static int count(int[] arr,int x)
    {
     int first=firstOccurrence(arr,x);
     int last=lastOccurrence(arr,x);
     if(first==-1 || last==-1) return 0;
     return last-first+1;
    }

    
   public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int x = 8;
        int ans = count(arr, x);
        System.out.println("The number of occurrences is: " + ans);
    }  
}
