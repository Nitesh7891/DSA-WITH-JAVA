import java.util.Scanner;

public class solution {
    public static int gcd(int a,int b){
       while(a%b!=0){
        int rem=a%b;
        a=b;
        b=rem;
       }
       return b;
    }

    public static int lcm(int a,int b){
       return (a*b)/gcd(a,b);
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two number to find its GCD and LCM:");
    int a=sc.nextInt();
    int b=sc.nextInt();

    System.out.println("GCD of "+a+" and "+b+" is: "+gcd(a,b));
    System.out.println("LCM of "+a+" and "+b+" is: "+lcm(a,b));
   } 
}
