
//if a number is a ppower of 2 then it have only one bit as 1

public class power {
    public static boolean poweroftwo(int n) {
      return n!=0&&(n&(n-1))==0?true:false;
    }


    public static void main(String[] args) {
        int n=16;
        System.out.println("check if number is power of two");
        System.out.println("Number :"+n);
        System.out.print(poweroftwo(n));
      
    }
}
