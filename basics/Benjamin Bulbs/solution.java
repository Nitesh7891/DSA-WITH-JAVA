import java.util.Scanner;

public class solution {
    public static void BenjaminBulbs(int n) {
       for(int i=1;i*i<=n;i++){
        System.out.println(i*i);
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of bulbs:");
        int n=sc.nextInt();
        BenjaminBulbs(n);
    }
}
