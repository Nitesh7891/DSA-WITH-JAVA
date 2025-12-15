public class solution {
    public static int fibonacciOdd(int n)
    {
      int a=1,b=2,c=3,sum=0;
      if(a%2!=0) sum+=a;
      if(b%2!=0) sum+=b;
      if(c%2!=0) sum+=c;
      for(int i=4;i<=n;i++)
      {
        int next=a+b+c;
        if(next%2!=0) sum+=next;
        a=b;
        b=c;
        c=next;
      }
      return sum;
    }
    public static void main(String[] args) {
        int n=18;
        System.out.println(fibonacciOdd(n));
    }
}
