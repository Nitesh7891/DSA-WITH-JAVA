

public class set {
    public static int setIthBit(int n,int i)
    {
        return (1<<i)|n;
    }
    public static void main(String[] args) {
        int n=13,i=1;
        System.out.println("Number before setting the ith bit: " + n);
        System.out.print("Number after setting the ith bit:"+setIthBit( n, i));
    }
}
