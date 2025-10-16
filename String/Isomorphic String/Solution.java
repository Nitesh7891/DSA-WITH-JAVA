import java.util.*;
public class Solution {
    public static boolean Isomorphic(String s,String t)
    {
        if(s.length()!=t.length())   return false;
        Map<Character,Character>  map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
          char original=s.charAt(i);
          char replace=t.charAt(i);
          if(!map.containsKey(original))
          {
              if(!map.containsValue(replace)) map.put(original,replace);
              
              else return false;
          }
          else{
            if(map.get(original)!=replace) return false;
          }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="paper";
        String t="title";
        System.out.println("Are these Strings Isomorphic: true or False?");
        System.out.println(Isomorphic(s,t));
    }
}
