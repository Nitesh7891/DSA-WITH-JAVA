

public class solution {
    public static int incrementEachDigit(int n,int k) {
        int reverse=0,answer=0;
        while(n>0)
        {
            int digit = n % 10;
            digit = (digit + k) % 10; // Increment and wrap around if it exceeds 9
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        while(reverse>0)
        {
            int lastdigit=reverse%10;
             answer=answer*10+lastdigit;
            reverse=reverse/10;
        }
        return answer;
    }
  public static void main(String[] args) {
    int n=99999;
    int k=3;
    System.out.println(incrementEachDigit(n,k));
  }  
}
