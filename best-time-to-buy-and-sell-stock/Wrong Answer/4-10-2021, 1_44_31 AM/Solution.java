// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
	int max=0;
	int min=prices[0];
        for(int i=1;i<prices.length-1;i++){

        if(prices[i]<min)
            min=prices[i];
        else
            max=Math.max(prices[i]-min,max);
	}
    return max;
}
}