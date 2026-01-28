import java.util.Scanner;

public class solution {
    public static int rotate(int num, int n) {
        if(n==0) return num;
        int temp = num, count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        n=n%count;
        if(n<1){
            n=n+count;
        }

        int div=(int)Math.pow(10,n);
        int multiplier=(int)Math.pow(10,count-n);
        int remainder=num%div;
        num=num/div;
        int rotatedNumber=remainder*multiplier+num;
        return rotatedNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        System.out.print("Enter number of rotations:");
        int n = sc.nextInt();
        System.out.println("The rotated number is: " + rotate(num, n));
    }
}
