public class check {
    public static boolean isIthBitSet(int n,int i)
    {
        //with left shift operator
        //if(((1<<i)&n)!=0)
        // return true;
        // else
        // return false;

        //with right shift operator
        return(((n>>i)&1)==1);
    }
    public static void main(String[] args) {
        int n=13,i=2;
        System.out.print(isIthBitSet(n, i));
    }
}
