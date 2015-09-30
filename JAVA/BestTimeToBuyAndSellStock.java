/*

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),

design an algorithm to find the maximum profit.


Example: [2,3,6,8,2,4] buy at Day1, Sell at Day4, max profit is 6.

*/

class BestTimeToBuyAndSellStock{
	public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxpro = 0;

        for (int i = 1; i < prices.length; i++){
        	min = Math.min(min, prices[i]);

        	maxpro = Math.max(maxpro,prices[i]-min);
        } 

        return maxpro;
    }
}