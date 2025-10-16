public class solution {
    public static boolean rotateString(String s,String t)
    {
        if(s.length()!=t.length())  return false;

        String combined=s+s;
        return combined.contains(t);
    }
    public static void main(String[] args) {
        String s="number";
        String t="bernum";
        System.out.println(rotateString(s, t));
    }
}
