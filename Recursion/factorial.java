public class factorial {

    public static int fact(int n,int i)
    {
        //functional recursion
        // if(n<=1)  return n;
        // return n*fact(n-1);

        // Parameterised recursion
        if(n==1) return i;
        return fact(n-1,i*n);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("Factorial of " + n + " is: " +fact(n,1));
    }
}
