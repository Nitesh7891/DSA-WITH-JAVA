import java.util.*;

public class longest {
    public static int longestSubstringWithKDistinct(String s,int k) 
    {
        // int maxLength=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     Map<Character,Integer> map=new HashMap<>();
        //     for(int j=i;j<s.length();j++)
        //     {
        //      map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

        //      if(map.size()>k) break;

        //      maxLength=Math.max(maxLength,j-i+1);
        //     }
        // }
        // return maxLength;

        int left=0;
        int maxLen=0;
        Map<Character,Integer> freq=new HashMap<>();
        for(int right=0;right<s.length();right++)
        {
          freq.put(s.charAt(right),freq.getOrDefault(s.charAt(right),0)+1);
          while(freq.size()>2)
          {
            freq.put(s.charAt(left),freq.get(s.charAt(left))-1);
            if(freq.get(s.charAt(left))==0) freq.remove(s.charAt(left));

            left++;

          }
            maxLen=Math.max(maxLen,right-left+1);

        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println(longestSubstringWithKDistinct(s, k));
    }
}
