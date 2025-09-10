
public class Toggle {
    public static int toggleIthBit(int n,int  i)
    {
        return (1<<i)^n;
    }
    public static void main(String[] args) {
        int n=13,i=1;
        System.out.println("Number before toggling the ith bit: " + n);
        System.out.println("Number after toggling the ith bit: " + toggleIthBit(n, i));
    }
}
