/**
 * 121. Best Time to Buy and Sell Stock
 * <p>
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">Click here</a>
 */
public class BestTimeToBuyStocks {
    public static int maxProfit(int[] prices) {
        int currentPrice = prices[0];
        int highestProfit = 0;
        for (int price : prices) {
            if (currentPrice > price) {
                currentPrice = price;
            }
            highestProfit = Math.max(highestProfit, price - currentPrice);
        }
        return highestProfit;
    }
}
