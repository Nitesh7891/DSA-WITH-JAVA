
public class CountMax {
    public CountMax(int[] nums){
        int[] freq=new int[101];
        int maxFreq=0,ans=0;
        for(int num:nums)
        {
            freq[num]++;
            maxFreq=Math.max(maxFreq,freq[num]);
        }
        for(int f:freq)
        {
            if(f==maxFreq) ans+=maxFreq;
        }
        System.out.println(ans);
    } 
    public static void main(String[] args) {
       int nums[]={1,1,2,2,3,4};
       CountMax obj1=new CountMax(nums);

    }
}
