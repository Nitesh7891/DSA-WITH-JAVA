

public class solution {
    public static int span(int[] arr){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int span=0;
        for(int num:arr){
            largest=largest>num?largest:num;
            smallest=smallest<num?smallest:num;

        }
        span=largest-smallest;
        return span;
    }

    public static void main(String[] args) {
        int[] arr={3,5,1,9,2,8};
        System.out.println("The span of the array is "+span(arr));
        
    }
}
