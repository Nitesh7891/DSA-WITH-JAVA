import java.util.*;

public class solution {
    public static String longestCommonPrefix(String[] s)
    {
        StringBuilder st=new StringBuilder();
        Arrays.sort(s);
        char[] first=s[0].toCharArray();
        char[] last=s[s.length-1].toCharArray();
        for(int i=0;i<first.length;i++)
        {
            if(first[i]==last[i]) st.append(first[i]);

            else break;
        }

        return st.toString();

    }
 public static void main(String[] args) {
    String[] s={"interview", "internet", "internal", "interval"};
    System.out.println(longestCommonPrefix(s));
 }   
}
