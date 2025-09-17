

public class largest {
    public static String largestOddNumber(String s)
    {
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)%2==1)
            return s.substring(0, i+1);
        }

        return "";
}
    public static void main(String[] args) {
        String s="6";
        System.out.println("The largest odd number will be :"+largestOddNumber(s));
    }
}
