


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


    //  Better approach
    //     int maxFruits=0,left=0;
    //     Map<Integer,Integer> fruit=new HashMap<>();
    //   for(int right=0;right<fruits.length;right++)
    //   {
        
    //     fruit.put(fruits[right],fruit.getOrDefault(fruits[right],0)+1);
       
    //     while(fruit.size()>2)
    //     {
    //         fruit.put(fruits[left],fruit.get(fruits[left])-1);
    //         if(fruit.get(fruits[left])==0)
    //         {
    //             fruit.remove(fruits[left]);
    //         }
    //         left++;
    //     }

    //     maxFruits=Math.max(maxFruits,right-left+1);

    // }
    // return maxFruits;

    //optimal solution
    int maxFruits=0,left=0;
    int[] count=new int[fruits.length];
    int distinct=0;
    for(int right=0;right<fruits.length;right++)
    {
        if(count[fruits[right]]==0)
        {
            distinct++;
        }
        count[fruits[right]]++;

        while(distinct>2)
        {
            count[fruits[left]]--;
            if(count[fruits[left]]==0)
            {
                distinct--;
            }
            left++;
        }

        maxFruits=Math.max(maxFruits,right-left+1);

    }
    return maxFruits;
    
}

public static void main(String[] args) {
    int[] arr={1, 2, 3, 2, 2};
    System.out.println(maxFruits(arr));
}
}