// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii

class Solution {
    int max=0;
    public int maxProfit(int[] prices) {
        for(int i=prices.length-1;i>-1;i--){
            if(i>0&&prices[i]>prices[i-1])
                max+=(prices[i]-prices[i-1]);
        }
        return max;
    }
}