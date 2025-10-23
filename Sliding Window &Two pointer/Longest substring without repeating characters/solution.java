

public class solution {
    static int maxLength(String s)
    {
        int maxLen=0;
        
        for(int i=0;i<s.length();i++)
        {
            int freq[]=new int[255];
            String temp="";
            for(int j=i;j<s.length();j++)
            {
                freq[s.charAt(j)]++;
                if(freq[s.charAt(j)]>1)
                {
                    break;
                }
                temp+=s.charAt(j);
                maxLen=Math.max(maxLen,temp.length());
            }
        }
        return maxLen;
    }
    public static void main(String[] args)
     {
        String s="abcde";
       System.out.println(maxLength(s));
     }
     
}
