public class solution {
    public int maxProfit(int[] prices)
    {
        int maxProfit=0,currentProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for(int price:prices)
        {
            if(price<buyPrice)
                buyPrice=price;

            currentProfit=price-buyPrice;
            maxProfit=Math.max(currentProfit,maxProfit);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        solution sol=new solution();
        int profit=sol.maxProfit(prices);
        System.out.println("Maximum profit is: " + profit);
    }
}
