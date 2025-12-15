import java.util.Scanner;

public class solution {
    public static boolean isPalindrome(int num)
    {
        int reverse=0;
        int originalNumber=num;
        while(num>0)
        {
            int ld=num%10;
            reverse=reverse*10+ld;
            num/=10;
        }
        return reverse==originalNumber;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc.nextInt();
   if(isPalindrome(num))
   {
    System.out.println("Number is palindrome");
   }
    else
    {
     System.out.println("Number is not palindrome");
    }
 }
}
