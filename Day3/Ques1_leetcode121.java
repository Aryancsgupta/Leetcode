package Day3;
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Ques1_leetcode121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int price : prices) {
            max = Math.max( max, price - min);
            min = Math.min( min, price);
        }
        return max;
    }
}
