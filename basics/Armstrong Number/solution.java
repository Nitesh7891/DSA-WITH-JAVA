import java.util.*;


public class solution {
    public static boolean isArmstrong(int num)
    {
        int originalNumber=num;
        int count=0;
        int sum=0;
    while(num>0)
    {
        num=num/10;
        count++;
    }

    num=originalNumber;
    while(originalNumber>0)
    {
        int ld=originalNumber%10;
        sum+=Math.pow(ld,count);
        originalNumber=originalNumber/10;
    }
    

    return num==sum;

    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number:");
      int num=sc.nextInt();
      System.out.println(isArmstrong(num));
    }
}
