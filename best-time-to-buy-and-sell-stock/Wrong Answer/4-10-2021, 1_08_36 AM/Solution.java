// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
	int max=0;
	for(int i=1;i<prices.length-1;i++){
		for(int j=i+1;j<prices.length;j++){
		    if((prices[j]-prices[i])>max)
                max=prices[j]-prices[i];
		}
	}
    return max;
}
}