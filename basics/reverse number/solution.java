public class solution{
    public static int reverseNumber(int n)
    {
        int reverse=0;
        while(n>0)
        {
            int ld=n%10;
            reverse=reverse*10+ld;
            n/=10;
           
        }
        return reverse;
    }
    public static void main(String[] args) {
        int n=10400;
        System.out.println(reverseNumber(n));
    }
}