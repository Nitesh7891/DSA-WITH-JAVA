import java.util.Scanner;


public class solution {
    public static int inverse(int n){
        int inverse=0;
        int counter=1;
        while(n>0){
            int digit=n%10;
            inverse+=(counter*Math.pow(10,digit-1));
             n=n/10;
             counter++;
        }
        return inverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find its inverse:");
        int n=sc.nextInt();
        System.out.println("The inverse of the number "+n+" is: "+inverse(n));
    }
}
