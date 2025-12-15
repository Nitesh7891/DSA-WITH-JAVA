public class solution{
  public static int countDigits(int n)
  {
    int counter=0;
     while(n>0)
     {
      n=n/10;
      counter++;
     }
     return counter;
  }
    public static void main(String[] args)
    {
       int n=1234567;
       System.out.println("Number od digits in "+n+" is "+countDigits(n));
    }
}

