public class longest {
    public static int longestCharacterReplacement(String s,int k)
    {
        //Brute force approach
        // int maxlength=Integer.MIN_VALUE;
        // for(int i=0;i<s.length();i++)
        // {
        //     int[] freq=new int[2];
        //     int maxFreq=0;
        //     for(int j=i;j<s.length();j++)
        //     {
        //        freq[s.charAt(j)-'A']++;
               
        //        maxFreq=Math.max(maxFreq,freq[s.charAt(j)-'A']);
        //       int replacement=(j-i+1)-maxFreq;
        //       if(replacement<=k)
        //       {
        //         maxlength=Math.max(maxlength,(j-i+1));
        //       }

        //     }
        // }
        // return maxlength;
       
      //  better approach
        int left=0,maxlength=0,maxFreq=0;
        int[] freq=new int[2];
        for(int right=0;right<s.length();right++)
        {
            freq[s.charAt(right)-'A']++;

            int windowsize=right-left+1;
            

            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);

            int replacement=windowsize-maxFreq;

            while(replacement>k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
                windowsize=right-left+1;
                replacement=windowsize-maxFreq;
            }

            maxlength=Math.max(maxlength,windowsize);
        }
        return maxlength;

       
    }
   public static void main(String[] args) {
       String s = "AABABBA";
       int k=1;
       System.out.println(longestCharacterReplacement(s, k));
   } 
}
