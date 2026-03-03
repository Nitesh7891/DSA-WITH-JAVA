import java.util.*;

public class solution {
    public static void primeNumbers(int n){
        // if(n<=2){
        //     System.out.println(2);
        //     return;
        // }
        for(int i=2;i<=n;i++){
            boolean prime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){ 
                    prime=false;
                     break;
                     }
            }
            if(prime) System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Prime numbers from 1 to " + n + " are:");
        primeNumbers(n);
    }
}
