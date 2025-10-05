
public class printTilln {
    public static void printNatural(int i,int n) {
        if(i>n) return ;
        System.out.println(i++);
        printNatural(i, n);
    }
    public static void main(String[] args) {
        int n=99;
        printNatural(0,n);
    }
}
