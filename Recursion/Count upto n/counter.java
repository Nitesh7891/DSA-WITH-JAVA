public class counter {
     public void Counter(int n,int count)
    { 
        if(count==n) return;
        System.out.println(++count);
        Counter(n,count);
      
    }
    public static void main(String[] args) {
        int n=7,count=0;
        counter obj=new counter();
        obj.Counter(n,count);
       
    }
}
