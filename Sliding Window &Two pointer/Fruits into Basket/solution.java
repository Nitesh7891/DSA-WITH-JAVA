import java.util.*;


public class solution {
    public static int maxFruits(int[] fruits) {
        // int maxFruits=0;
        // for(int i=0;i<fruits.length;i++)
        // {
        //     Map<Integer,Integer> fruit=new HashMap<>();
        //     int currentCount=0;
        //     for(int j=i;j<fruits.length;j++)
        //     {
        //         fruit.put(fruits[j],fruit.getOrDefault(fruits[j],0)+1);
        //         if(fruit.size()>2)
        //         {
        //             break;
        //         }
        //         currentCount++;

        //     }
        //     maxFruits=Math.max(maxFruits,currentCount);
        // }
        // return maxFruits;



        int maxFruits=0,currentcount=0,left=0;

    for(int right=0;right<fruits.length;right++)
    {
        Map<Integer,Integer> fruit=new HashMap<>();

        fruit.put(fruits[right],fruit.getOrDefault(fruits[right],0)+1);
        currentcount++;
        

    }
    return maxFruits;
}

public static void main(String[] args) {
    int[] arr={1, 2, 3, 2, 2};
    System.out.println(maxFruits(arr));
}
}