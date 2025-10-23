
public class number {
    public static int numberOfSubstrings(String s)
    {
    //     int count=0;
    //     for(int i=0;i<s.length();i++)
    //     {
    //         int[] freq=new int[3];

    //         for(int j=i;j<s.length();j++)
    //         {
    //           freq[s.charAt(j)-'a']++;
    //           if(freq[0]>0 && freq[1]>0 && freq[2]>0) count++;  
    //         }
    //     }
    //     return count;


    int maxSubstring=0;
    int left=0;
     int[] freq=new int[3];
    for(int right=0;right<s.length();right++)
    {
        freq[s.charAt(right)-'a']++;

          while(freq[0]>0 && freq[1]>0 && freq[2]>0)
          {
            maxSubstring+=(s.length()-right);
            freq[s.charAt(left)-'a']--;
            left++;
          }
    }
    return maxSubstring;
    }
    public static void main(String[] args) {
        String s="ccabcc";
        System.out.println(numberOfSubstrings(s));
    }
}
