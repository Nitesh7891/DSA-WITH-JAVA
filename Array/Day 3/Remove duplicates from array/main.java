import java.util.*;

public class main {
    public int[] removeDuplicates(int[] arr) {
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
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array " + Arrays.toString(arr));
        main obj1 = new main();
        System.out.println("Array withour duplicate elements:" + Arrays.toString(obj1.removeDuplicates(arr)));

    }
}