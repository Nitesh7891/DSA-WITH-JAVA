import java.util.Scanner;

public class solution {
    public static void divisors(int num)
    {
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                System.out.print(i+",");
        }
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc.nextInt();
    divisors(num);
 }
}
