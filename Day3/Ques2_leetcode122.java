// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

package Day3;
public class Ques2_leetcode122 {
     public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                max += prices[i] - prices[i-1];
            }
        }
        return max;
    }
}
