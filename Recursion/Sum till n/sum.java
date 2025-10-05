public class sum {

    public static int sumTilln(int n)
    {
        //Parameterised recursion
    //     if((i==0)||(i<1) ) return n;
    //     return sumTilln(i-1, n+i);


    // functional recursion
    if(n==0)  return 0;
    return n+sumTilln(n-1);
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println("Sum till " + n + " is: " +sumTilln(n));
    }
}
