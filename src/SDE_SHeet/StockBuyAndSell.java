package SDE_SHeet;

public class StockBuyAndSell {
    public static   int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i =0; i<prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else if (prices[i] - minPrice > maxprofit)
                maxprofit = prices[i] - minPrice;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(StockBuyAndSell.maxProfit(prices));
    }
}
