import java.util.Scanner;

public class solution {
    public static boolean isprime(int num)
    {
        if(num<=1) return false;
        int count=0;
        for(int i=2;i<=num;i++)
        {
          if(num%i==0) count++;
        }
        return count==1;
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc.nextInt();
    System.out.println(isprime(num));
  }  
}
