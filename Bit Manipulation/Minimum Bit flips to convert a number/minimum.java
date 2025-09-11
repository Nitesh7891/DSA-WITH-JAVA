public class minimum {
    public static int minBitFlips(int start,int goal)
    {   int count=0;
        int num=start^goal;
        while(num!=0)
        {
           num&=(num-1);
           count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int start=10,goal=7;
        System.out.println("Minimum No. of Bits required to Flip to convert a number from "+start+" to "+goal+" is "+minBitFlips(start,goal));
    }
}
