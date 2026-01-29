import java.util.Scanner;

public class solution {
    public static void barChart(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=max>arr[i]?max:arr[i];
        }
        for(int j=max;j>=1;j--){
         for(int i=0;i<arr.length;i++){
            if(arr[i]>=j){
                System.out.print("* ");
            }
            else {
                System.out.print("  ");}
         }
         System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        barChart(arr);
    }
}
