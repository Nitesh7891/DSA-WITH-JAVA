import java.util.*;

public class swap {
    public static void swapping(int a,int b)
    {
         a=a^b;
         b=a^b;
         a=a^b;
         System.out.print("After swapping a="+a+ " b="+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swapping a="+a+" b="+b);
        swapping(a,b);
        
    }
}
