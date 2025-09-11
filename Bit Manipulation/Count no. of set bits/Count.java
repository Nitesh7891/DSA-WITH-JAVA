//In an odd numbber the last rightmost bit will always be 1.
//n>>1 = n/2;
public class Count {
    public static int CountNoOfSetBits(int n)
    {
        int count=0;
       while(n>1)
       {
        if((n&1)==1) count++;

        n=n>>1;
       }
       if(n==1) count+=1;

       return count;
    }

     
    
    // public static int CountNoOfSetBits(int n)
    //{
    //    int count=0;
    //   while(n!=0)
    //   {
    //   n=(n&(n-1));
    //   count++;
    //   }
    //   return count;
    //}
    public static void main(String[] args) {
        int n=13;
        System.out.println("The number of set bits in"+n+" is" +CountNoOfSetBits(n));
    }


}



