
public class clear {
    public static int clearIthBit(int n,int i)
    {
  return ~(1<<i)&n;
    }
    public static void main(String[] args) {
        int n=18;
        int i=3;
        System.out.print("number after removing the ith bit"+clearIthBit(n, i));
    }
}
