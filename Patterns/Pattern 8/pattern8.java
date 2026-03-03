// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1





public class pattern8 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            int number=1;
            for(int j=1;j<=i;j++){
              System.out.print(number+" ");
              number++;
            }
            System.out.println();
        }
    }
}
