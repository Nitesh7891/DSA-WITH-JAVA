import java.util.Scanner;

public class solution {
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
       return (a*a+b*b==c*c)||(b*b+c*c==a*a)||(c*c+a*a==b*b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(isPythagoreanTriplet(a,b,c)){
            System.out.println("Yes");
        }
            else {
            System.out.println("No");
            }
    }
}
