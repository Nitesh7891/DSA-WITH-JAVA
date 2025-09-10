public class remove {
    public static int removeRightmostSetBit(int n) {
        // This operation removes the rightmost set bit from n
        return n&(n-1);
    }

    public static void main(String[] args) {
        int n=32;
        System.out.print("The number after removing the rightmost set but is:"+removeRightmostSetBit(n));
    }
}
