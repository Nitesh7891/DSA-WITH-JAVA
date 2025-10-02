

public class counter {
    int count=0;
    public void Counter()
    { if(count==7) return;
        System.out.println(count++);
        Counter();
      
    }
    public static void main(String[] args) {
        counter obj=new counter();
        obj.Counter();
       
    }
}
