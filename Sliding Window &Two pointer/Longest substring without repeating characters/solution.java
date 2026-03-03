import java.util.*;
import java.io.*;

public class solution {
    public static int maxLength(String s)
    {
        //optimal approach
        int maxLength=0;
        int left=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                left=Math.max(left,map.get(ch)+1);
            }

            map.put(ch,right);
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args)
     {
        String s="abcde";
       System.out.println(maxLength(s));
     }
     
}
